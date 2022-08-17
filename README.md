# Tostada
[![](https://jitpack.io/v/joaogarrido98/tostada.svg)](https://jitpack.io/#joaogarrido98/tostada)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## This is a library that works both with kotlin and java. 
`Toast for everyone, you want jelly you got it, you want peanut butter, you got it.`

# Before you start

Add to your `settings.gradle` file

```gradle
dependencyResolutionManagement {
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
	implementation 'com.github.joaogarrido98:tostada:1.2.0'
}
```

# Usage
This is a step by step of how to use it.

Time can be either
```kotlin 
Tostas.FAST
```
or
```kotlin
Tostas.SLOW
```
## Kotlin

Display an information Toast:
```kotlin
Tostas.info(this, "This is an information", Tostas.SLOW)
```

Display an error Toast:
```kotlin
Tostas.error(this, "This is an error", Tostas.SLOW)
```

Display an success Toast:
```kotlin
Tostas.success(this, "This is a success", Tostas.SLOW)
```

Display an warn Toast:
```kotlin
Tostas.warn(this, "This is a warning", Tostas.SLOW)
```
Display a neutral Toast:
```kotlin
Tostas.neutral(this, "This is a neutral", Tostas.SLOW)
```
Display a custom Toast:
```kotlin
val d = AppCompatResources.getDrawable(this, R.drawable.pink_stuff)
Tostas.custom(this, "Custom Toast", Tostas.SLOW, d!!, "#FF69B4")
```

## Java

Display an information Toast:
```java
Tostas.info(Activity.this, "This is an information", Tostas.FAST);
```

Display an error Toast:
```java
Tostas.error(Activity.this, "This is an error", Tostas.FAST);
```

Display an success Toast:
```Java
Tostas.success(Activity.this, "This is a success", Tostas.FAST);
```

Display an warn Toast:
```java
Tostas.warn(Activity.this, "This is a warning", Tostas.FAST);
```

Display a neutral Toast:
```java
Tostas.neutral(Activity.this, "This is a neutral", Tostas.FAST);
```
Display a custom Toast:
```java
Drawable d = AppCompatResources.getDrawable(getActivity(), R.drawable.pink_stuff)
Tostas.custom(Activity.this, "Custom Toast", Tostas.FAST, d, "#FF69B4");
```
