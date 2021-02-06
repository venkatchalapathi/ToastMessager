# ToastMessager
## A simple android library to display toast messages in different positions in a screen

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.venkatchalapathi:ToastMessager:1.0'
	}
## Usage:

	ToastMessager.showTopLeft(this, "Your Message");

## Methods

- TOP_LEFT : ToastMessager.showTopLeft(context,"Message")
- TOP_RIGHT : ToastMessager.showTopRight(context,"Message")
- TOP_CENTER : ToastMessager.showTopCenter(context,"Message")
- CENTER_LEFT : ToastMessager.showCenterLeft(context,"Message")
- CENTER : ToastMessager.showCenter(context,"Message")
- CENTER_RIGHT : ToastMessager.showCenterRight(context,"Message")
- BOTTOM_LEFT : ToastMessager.showBottomLeft(context,"Message")
- BOTTOM_CENTER : ToastMessager.showBottomCenter(context,"Message")
- BOTTOM_RIGHT : ToastMessager.showBottomRight(context,"Message")

## Sample
<img src="https://github.com/venkatchalapathi/ToastMessager/blob/master/taps-recording.gif" width="300" height="500" />




Thanks!!!@venkat
