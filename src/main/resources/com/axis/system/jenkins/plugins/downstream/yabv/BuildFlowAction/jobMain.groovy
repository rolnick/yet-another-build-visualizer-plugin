package com.axis.system.jenkins.plugins.downstream.yabv.BuildFlowAction

if (my.shouldDisplayBuildFlow()) {
  div(id: 'yabv') {
    h2('Build Flow')
    include(my, 'buildFlowJsCss.groovy')
  }
  script(src: "${rootURL}/plugin/yet-another-build-visualizer/scripts/move.js",
      type: 'text/javascript')
}
