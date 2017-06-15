require 'net/http'
require 'uri'
require 'openssl'

def load_message(fixture_file)
  ModavCucumber.load_fixture("#{fixture_file}.json")
end

def curlfixture(fixture_name)
  uri = URI.parse('https://localhost:9999/hello')
  request = Net::HTTP::Post.new(uri)
  request.body = ''
  request.body << File.read("fixtures/#{fixture_name}.json").delete("\r\n")
  req_options = {
    use_ssl: uri.scheme == 'https',
    verify_mode: OpenSSL::SSL::VERIFY_NONE
  }
  get_response(uri, req_options, request)
end

def get_response(uri, req_options, request)
  response = Net::HTTP.start(uri.hostname, uri.port, req_options) do |http|
    http.request(request)
  end
  response.body
end

When(/^(.*) message sent to Lambda$/) do |message|
  @result = JSON.parse(curlfixture(message))
end

Then(/^Lambda will respond with a welcome message (.*)$/) do |fixture_name|
  response = load_message(fixture_name)
  expect(JSON.parse(response)).to eq(@result)
end
