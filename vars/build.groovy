#!/usr/bin/groovy

import scr.Maven

def call(){
    def h= new Shell(this)
    h.mvn 'build'
    
 }
