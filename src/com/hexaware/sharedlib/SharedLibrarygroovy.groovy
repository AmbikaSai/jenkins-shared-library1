package com.hexaware.sharedlib;

class SharedLibrarygroovy {
    def steps
    
    public SharedLibrary(steps){
        this.steps=steps
    }
    
    public void startBuild(){
        steps.echo "Hello, World"
    }
}
