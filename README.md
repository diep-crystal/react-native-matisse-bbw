
# react-native-matisse-bbw

## Getting started

`$ npm install react-native-matisse-bbw --save`

### Mostly automatic installation

`$ react-native link react-native-matisse-bbw`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNMatisseBbwPackage;` to the imports at the top of the file
  - Add `new RNMatisseBbwPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-matisse-bbw'
  	project(':react-native-matisse-bbw').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-matisse-bbw/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-matisse-bbw')
  	```

## Usage
```javascript
import RNMatisseBbw from 'react-native-matisse-bbw';

// TODO: What to do with the module?
RNMatisseBbw;
```
  