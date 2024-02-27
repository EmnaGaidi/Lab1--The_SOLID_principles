package com.directi.training.srp.exercise_refactored;

public class CarManager {
    private DAO _DAO;
    private CarCompare _CarCompare;
    private CarCharacteristics _CarCharacteristics;

    public String getCarsNames()
    {
        return _CarCharacteristics.getCarsNames(_DAO.getList());
    }

    public Car getBestCar()
    {
        return _CarCompare.getBestCar(_DAO.getList());
    }
}
