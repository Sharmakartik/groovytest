#!/usr/bin/bash

def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    sh 'def -h'
     
     echo "${env.BRANCH_NAME}"
     echo "${env.BUILD_NUMBER}"
    echo "Hello, ${name}."
}
