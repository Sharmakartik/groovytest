#!/usr/bin/groovy

class Maven implements Serializable {
  def steps
  Maven(steps) {this.steps = steps}

    def mvn(args) {
    steps.sh "${steps.tool 'jenkins-mvn'}/bin/mvn -o ${args}"
  }
}
