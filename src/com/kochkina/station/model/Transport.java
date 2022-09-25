package com.kochkina.station.model;

public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public abstract void updateTyre();


    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


}

