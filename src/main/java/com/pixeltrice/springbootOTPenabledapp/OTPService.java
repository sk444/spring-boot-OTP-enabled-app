package com.pixeltrice.springbootOTPenabledapp;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

@Service
public class OTPService {

	private static final Integer EXPIRE_MINS = 4;
    private LoadingCache<String, Integer> otpCache;
    public OTPService(){
      super();
      otpCache = CacheBuilder.newBuilder().
      expireAfterWrite(EXPIRE_MINS, TimeUnit.MINUTES)
      .build(new CacheLoader<String, Integer>() {
      public Integer load(String key) {
             return 0;
       }
   });
 }
//This method is used to push the opt number against Key. Rewrite the OTP if it exists
 //Using user id  as key
 public int generateOTP(String key){
Random random = new Random();
int otp = 100000 + random.nextInt(900000);
otpCache.put(key, otp);
return otp;
 }
 //This method is used to return the OPT number against Key->Key values is username
 public int getOtp(String key){ 
try{
 return otpCache.get(key); 
}catch (Exception e){
 return 0; 
}
 }
//This method is used to clear the OTP catched already
public void clearOTP(String key){ 
 otpCache.invalidate(key);
 }
}
