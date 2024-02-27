package com.directi.training.ocp.exercise_refactored;

public interface Resource {
    public void markSlotFree(int resourceId);
    public void markSlotBusy(int resourceId);
    public int findFreeSlot();
}