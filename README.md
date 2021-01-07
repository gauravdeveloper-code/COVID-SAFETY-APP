# COVID-SAFETY-APP

# Application description

This is a Android application regarding the novel corona virus.

# By using this application user will get 

* Updated information regarding number of cases*
* COVID beds available* 
* Latest guidelines* 
* User can check their chances of them having the virus*

# #implementations used in gradel for the appliction

    //for material layout
    implementation 'com.google.android.material:material:1.0.0'
    or you can uses
    implementation 'com.google.android.material:material:1.2.0-alpha04'
    
    //for QR code generator
    implementation 'com.google.zxing:core:3.4.0'
    
    //for QR scanner part
    implementation 'com.budiyev.android:code-scanner:2.1.0'
    
    //for circle indicator at pages
    implementation 'me.relex:circleindicator:2.1.4'
    implementation 'com.android.volley:volley:1.1.1'
    
    //for cardview part
    implementation "androidx.cardview:cardview:1.0.0"
    
     //for scrolling pages
    implementation "androidx.viewpager2:viewpager2:1.0.0"
    
    //for firebase
    implementation platform('com.google.firebase:firebase-bom:26.1.0')
    implementation 'com.google.firebase:firebase-analytics-ktx'
    implementation 'com.google.firebase:firebase-auth:16.0.5'
    
    
   # PERMISSIONS USED IN MANIFEST
    
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.CAMERA" />
    
    
