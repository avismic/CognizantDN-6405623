package com.example.builder;

public class Computer {
    private final String CPU;
    private final int RAM;

    private final int storage;    
    private final boolean hasGPU;
    private final String OS;

    private Computer(Builder builder) {
        this.CPU     = builder.CPU;
        this.RAM     = builder.RAM;
        this.storage = builder.storage;
        this.hasGPU  = builder.hasGPU;
        this.OS      = builder.OS;
    }

    @Override
    public String toString() {
        return "Computer {" +
               "CPU='"     + CPU     + '\'' +
               ", RAM="     + RAM     + "GB" +
               ", storage=" + storage + "GB" +
               ", hasGPU="  + hasGPU  +
               ", OS='"     + OS      + '\'' +
               '}';
    }

    public static class Builder {
        private final String CPU;
        private final int RAM;

        private int storage = 256;
        private boolean hasGPU = false;
        private String OS = "Windows 10";

        public Builder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(int gb) {
            this.storage = gb;
            return this;
        }

        public Builder withGPU(boolean flag) {
            this.hasGPU = flag;
            return this;
        }

        public Builder OS(String osName) {
            this.OS = osName;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
