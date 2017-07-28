package com.smartdevicelink.util;


public class Version {

    Integer major,minor,patch;

    public Version(){
        major = 0;
        minor = 0;
        patch = 0;
    }

    public Version(String versionString){
        String[] versions = versionString.split("\\.");
        if(versions.length!=3){
            throw new IllegalArgumentException("Incorrect version string format");
        }
        major = Integer.valueOf(versions[0]);
        minor = Integer.valueOf(versions[1]);
        patch = Integer.valueOf(versions[2]);

    }

    public Integer getMajor() {
        return major;
    }

    public Integer getMinor() {
        return minor;
    }

    public Integer getPatch() {
        return patch;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(major);
        builder.append(".");
        builder.append(minor);
        builder.append(".");
        builder.append(patch);
        return builder.toString();
    }
}
