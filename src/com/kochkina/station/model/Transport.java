package com.kochkina.station.model;

public abstract class Transport {
    protected String modelName;
    protected int wheelsCount;

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

