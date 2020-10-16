# MukeshOtpView


<h3> Mukesh Rajput </h3>
</br>

<p>
  Hello Friends
  </br>
  This is a OTP View dependency for android project. Simply you can add this library into your project and design accroding to your requiremens.
</p>

<h5>How to integrate into your app?</h5>




<h4>Source Code</h4>

<p>Simple OTP View</p>

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


<p>Inbuild Rectangle OTP View</p>

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


<p>Custom Design OTP View</p>

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


<h5>Output of all OTP views</h5>
<p>In a image shows all OTP views and you can check a example code from source code. Simply you can dawnload a github project or open the Main Activity class and xml file.</p>

![MukeshOtpView](https://github.com/rajputmukesh748/MukeshOtpView/blob/main/otp%20example%20output.png)
