Visual Logger
=============
Android Visual Logcat could show log on mobile screen directly! If you are an android developer,you do not need check log in Android Studio or other IDE. If you are a tester, you could capture some logs more convenient!

**<font size="+1">Download App In Google Play: https://play.google.com/store/apps/details?id=com.wenga.visuallogger</font>**

Add VisualLogger to your project
--------------------------------
If you are a gradle user
```groovy
// In your root build.gradle file:
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' } <-- add this line
	}
}
 
// In your app projects build.gradle file:
apply plugin: 'com.android.application'
 
dependencies {
    compile 'com.github.onlywenga:VisualLogger:v1.0.0' <-- add this line
}
```

If you are a maven user
```groovy
// Add the JitPack repository to your build file
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
 
// Add the dependency
<dependency>
    <groupId>com.github.onlywenga</groupId>
        <artifactId>VisualLogger</artifactId>
    <version>v1.0.0</version>
</dependency>
```

Init VisualLogger and Use it
----------------------------
```groovy
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        VisualLog.init(this); <-- add this line just once
        setContentView(R.layout.activity_main);
        if(DEBUG){
           VisualLog.d("MainActivity","onCreate");  <-- use it anywhere you want 
        }
    }
```
