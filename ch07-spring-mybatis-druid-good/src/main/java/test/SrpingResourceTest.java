package test;


import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Arrays;

public class SrpingResourceTest {
   Resource resource;
    Resource[] resources;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) throws IOException{
        System.out.println("Resource.getClass:" + resource.getClass());
        System.out.println("resource.getInputStream:" + resource.getInputStream());

        this.resource = resource;
    }
public Resource[] getResources(){
        return resources;
}

    public void setResources(Resource[] resources) throws IOException{
        System.out.println("resource.getClass:" + resources[0].getClass());
        System.out.println("resource.getInputStream:" + resources[0].getInputStream());
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "SrpingResourceTest{" +
                "resource=" + resource +
                ", resources=" + Arrays.toString(resources) +
                '}';
    }
}
