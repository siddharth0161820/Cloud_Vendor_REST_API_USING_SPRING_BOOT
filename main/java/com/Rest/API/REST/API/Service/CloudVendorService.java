package com.Rest.API.REST.API.Service;

import com.Rest.API.REST.API.Model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    //THIS IS BUSINESS LAYER WEHRE WE GONNA
    // DEFINE ALL THE METHODS NEEDED FOR ..

    //METHODS()--
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudCVendor(String cloudVendorId);
    //To get all the avaialble cloud vendors info
    public List<CloudVendor> getAllCloudVendors();


}
