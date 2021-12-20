@Library('Ambika-Shared-Library')
import package com.hexaware.sharedlib.SharedLibrary;
pipeline{
  agent any
  stages{
    stage('Archive artifacts'){
      steps{
        new SharedLibrary(steps).startBuild()
        archiveArtifacts artifacts: ''
