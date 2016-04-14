package com.tatsuyaoiw;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

    @Parameter(defaultValue = "Hello, world.")
    private String greeting;

    public void execute() throws MojoExecutionException {
        getLog().info(greeting);
    }
}