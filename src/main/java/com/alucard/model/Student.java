package com.alucard.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Alucard on 4/9/2017.
 */
public class Student {
  
  private String mFirstName;
  private String mLastName;
  private String mCountry;
  private String mGender;
  private Map<String, String> mCountryOptions;
  
  public Student() {
    // populate country options: using ISO country code
    mCountryOptions = new LinkedHashMap<String, String>();
    mCountryOptions.put("DO", "Dominican Republic");
    mCountryOptions.put("BOL", "Bolivia");
    mCountryOptions.put("HA", "Haiti");
    mCountryOptions.put("ITA", "Italy");
    mCountryOptions.put("USA", "United States");
  }
  
  public String getFirstName() {
    return mFirstName;
  }
  
  public void setFirstName(String firstName) {
    this.mFirstName = firstName;
  }
  
  public String getLastName() {
    return mLastName;
  }
  
  public void setLastName(String lastName) {
    this.mLastName = lastName;
  }
  
  public void setCountry(String country) {
    mCountry = country;
  }
  
  public String getCountry() {
    // return Country name from Map using country as key
    return mCountryOptions.get(mCountry);
  }
  
  public Map<String, String> getCountryOptions() {
    return mCountryOptions;
  }
  
  public void setGender(String gender) {
    mGender = gender;
  }
  
  public String getGender() {
    return mGender;
  }
}
