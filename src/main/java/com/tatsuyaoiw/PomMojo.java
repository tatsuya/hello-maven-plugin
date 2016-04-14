package com.tatsuyaoiw;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

@Mojo(name = "pom")
public class PomMojo extends AbstractMojo {

	@Parameter(defaultValue = "${basedir}/pom.xml")
	private File pomXml;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info(pomXml.toString());
	}
}
