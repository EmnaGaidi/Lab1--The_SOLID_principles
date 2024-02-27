package com.directi.training.ocp.exercise_refactored;


public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeSlot();
        if(resourceId == INVALID_RESOURCE_ID){
            System.out.println("ERROR: Attempted to allocate invalid resource");
       }else{
         resource.markSlotBusy(resourceId);
        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {  
        if(resourceId == INVALID_RESOURCE_ID){
            System.out.println("ERROR: Attempted to free invalid resource");
       }else{
            resource.markSlotFree(resourceId);}
    }

}
