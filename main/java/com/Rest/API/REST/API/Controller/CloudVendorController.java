package com.Rest.API.REST.API.Controller;

import com.Rest.API.REST.API.Model.CloudVendor;
import com.Rest.API.REST.API.Service.CloudVendorService;
import com.Rest.API.REST.API.response.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CloudVendor")
public class CloudVendorController {

    //Add instance of service layer as controller interact with Service layer
    CloudVendorService cloudVendorService;

    //constructor for cloudvendorService

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    //1> method()--get request gives  vendor details using ids from Database
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
       return ResponseHandler.RseponseBuilder("Requested vendor details are given here",
                HttpStatus.OK,cloudVendorService.getCloudCVendor(vendorId));

    }

    //1> method()--get request gives all vendor details from Database
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();

    }

    //2()--create new resources--post
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    cloudVendorService.createCloudVendor(cloudVendor);
     return "cloud vendor created successfully";
    }

    //3()---update an API using --PUT
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
       cloudVendorService.updateCloudVendor(cloudVendor);
        return "cloud vendor updated successfully";
    }

    //4()--deletion request
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
       cloudVendorService.deleteCloudVendor(vendorId);
        return "cloud vendor deleted successfully";
    }
}
