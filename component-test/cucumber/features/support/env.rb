require 'mod_av_cucumber_env'
require 'mod_av_cucumber/fixtures'
require 'aws-sdk'

AfterConfiguration do
  ModavCucumber.setup_and_start_under_test(
    ['../../samples/run.sh']
  )
end
