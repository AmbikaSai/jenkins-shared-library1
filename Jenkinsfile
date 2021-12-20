@Library('Ambika-Shared-Library')
import com.Hexaware.SharedLib.SharedLibrary;
pipeline{
  agent any
  stages{
    stage('Archive artifacts'){
      steps{
        new SharedLibrary(steps).startBuild()
        archiveArtifacts artifacts: ''
