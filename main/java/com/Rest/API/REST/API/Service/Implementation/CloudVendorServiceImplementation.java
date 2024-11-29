package com.Rest.API.REST.API.Service.Implementation;

import com.Rest.API.REST.API.Exception.CloudVendorNotFoundException;
import com.Rest.API.REST.API.Model.CloudVendor;
import com.Rest.API.REST.API.Service.CloudVendorService;
import com.Rest.API.REST.API.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //annotation to make it realize as service layer..
public class CloudVendorServiceImplementation implements CloudVendorService {


    //importantly get instance of repository layer(cloudvendorrepository)
    CloudVendorRepository cloudVendorRepository;
    //constructor for cloudvendorrepository

    public CloudVendorServiceImplementation(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        //More Business Logic will be done here..
        //saves data coming to cloudVendor to database
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        //More Business Logic will be done here..
        //update data coming to cloudVendor to database
        cloudVendorRepository.save(cloudVendor);
        return "Successfully updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        //More Business Logic will be done here..
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted successfully";
    }

    @Override
    public CloudVendor getCloudCVendor(String cloudVendorId) {
        //More Business Logic will be done here..
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty()){
             throw new CloudVendorNotFoundException("Requested Cloud Vendor Does Not Exist");
        }
       return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        //More Business Logic will be done here..
        return cloudVendorRepository.findAll();
    }
}
