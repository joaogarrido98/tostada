# Tostada
[![](https://jitpack.io/v/joaogarrido98/tostada.svg)](https://jitpack.io/#joaogarrido98/tostada)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## This is a library that works both with kotlin and java. 
`Toast for everyone, you want jelly you got it, you want peanut butter, you got it.`

# Before you start

Add to your `build.gradle` project

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

# Dependencies
Add to your `build.gradle` module
```gradle
dependencies {
	...
	implementation 'com.github.joaogarrido98:tostada:0.6.3'
}
```

# Usage
This is a step by step of how to use it.

Time can be either
```kotlin 
Toast.LENGTH_LONG
```
or
```kotlin
Toast.LENGTH_SHORT
```
## Kotlin

Display an information Toast:
```kotlin
Tostas.info(this, "This is an information", Toast.LENGTH_LONG)
```

Display an error Toast:
```kotlin
Tostas.error(this, "This is an error", Toast.LENGTH_SHORT)
```

Display an success Toast:
```kotlin
Tostas.success(this, "This is a success", Toast.LENGTH_LONG)
```

Display an warn Toast:
```kotlin
Tostas.warn(this, "This is a warning", Toast.LENGTH_SHORT)
```
Display a neutral Toast:
```kotlin
Tostas.neutral(this, "This is a neutral", Toast.LENGTH_SHORT)
```
Display a custom Toast:
```kotlin
val d = AppCompatResources.getDrawable(this, R.drawable.pink_stuff)
Tostas.custom(this, "Custom Toast", Toast.LENGTH_LONG, d!!, "#FF69B4")
```

## Java

Display an information Toast:
```java
Tostas.info(Activity.this, "This is an information", Toast.LENGTH_LONG);
```

Display an error Toast:
```java
Tostas.error(Activity.this, "This is an error", Toast.LENGTH_SHORT);
```

Display an success Toast:
```Java
Tostas.success(Activity.this, "This is a success", Toast.LENGTH_LONG);
```

Display an warn Toast:
```java
Tostas.warn(Activity.this, "This is a warning", Toast.LENGTH_SHORT);
```

Display a neutral Toast:
```kotlin
Tostas.neutral(Activity.this, "This is a neutral", Toast.LENGTH_SHORT);
```
Display a custom Toast:
```kotlin
Drawable d = AppCompatResources.getDrawable(getActivity(), R.drawable.pink_stuff)
Tostas.custom(Activity.this, "Custom Toast", Toast.LENGTH_LONG, d, "#FF69B4");
```
