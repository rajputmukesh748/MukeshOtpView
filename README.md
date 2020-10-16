# MukeshOtpView ![](https://jitpack.io/v/rajputmukesh748/MukeshOtpView.svg)

<h3> Mukesh Rajput </h3>
</br>

<p>
  Hello Friends
  </br>
  This is a OTP View dependency for android project. Simply you can add this library in your project and design accroding to your requiremens.
</p>


<h5>Output of all OTP views</h5>
<p>In a image shows all OTP views and you can check a example code from source code. Simply you can dawnload a github project or open the Main Activity class and xml file.</p>

![MukeshOtpView](https://github.com/rajputmukesh748/MukeshOtpView/blob/main/otp%20example%20output.png)



<h3>How to integrate into your app?</h3>
&nbsp;&nbsp;Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

    allprojects {
		  repositories {
		  	...
		  	maven { url 'https://jitpack.io' }
		  }
	  }
  
 
Step 2. Add the dependency

    dependencies {
	        implementation 'com.github.rajputmukesh748:MukeshOtpView:1.0.0'
	  }


<h4>Source Code</h4>

<h5>Simple OTP View</h5>

    <com.mukesh.mukeshotpview.mukeshOtpView.MukeshOtpView
        android:id="@+id/simpleOtpView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:inputType="number"
        android:text="124356"
        android:textColor="@android:color/black"
        android:textSize="18sp"
        app:hideLineWhenFilled="false"
        app:itemCount="6"
        app:lineColor="@android:color/holo_red_light"
        app:state_filled="true"
        app:viewType="line"
        />


<h5>Inbuild Rectangle OTP View</h5>

    <com.mukesh.mukeshotpview.mukeshOtpView.MukeshOtpView
        android:id="@+id/inBuildRectangleOtpView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:inputType="number"
        android:text="124356"
        android:textColor="@android:color/black"
        android:textSize="18sp"
        app:hideLineWhenFilled="false"
        app:itemCount="6"
        app:lineColor="@android:color/holo_red_light"
        app:state_filled="true"
        app:viewType="rectangle"
        />


<h5>Custom Design OTP View</h5>

    <com.mukesh.mukeshotpview.mukeshOtpView.MukeshOtpView
        android:id="@+id/customOtpView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:inputType="number"
        android:text="124356"
        android:itemBackground="@drawable/gray_round_corners"
        android:textColor="@android:color/black"
        android:textSize="18sp"
        app:hideLineWhenFilled="false"
        app:itemCount="6"
        app:lineColor="@color/colorAccent"
        app:state_filled="true"
        app:viewType="none"
        />
        
        
<h5>Add this into your styles.xml</h5>

    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="mukeshOtpStyle">@style/OtpWidget.OtpView</item>
    </style>


    <style name="OtpWidget.OtpView" parent="Widget.AppCompat.EditText">
        <item name="android:background">@null</item>
        <item name="android:minHeight">0dp</item>
        <item name="android:maxLines">1</item>
    </style>


<h5>Add a otp complete listener for get a entered OTP text.</h5>

    simpleOtpView.setOtpCompletionListener(object : MukeshOtpCompleteListener {
            override fun otpCompleteListener(otp: String?) {
                Toast.makeText(
                    this@MainActivity,
                    "Entered OTP Number is $otp",
                    Toast.LENGTH_LONG
                ).show()
            }
        })


<b><h3>Thanks for your support. Please try and support it.</h3></b>
