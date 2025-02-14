plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.nlcs"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.nlcs"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.crashlytics.buildtools)
    implementation(libs.androidx.ui.graphics.android)
    implementation(libs.androidx.room.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Import the BoM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:33.1.2"))

    // Add the dependency for the Realtime Database library
    // When using the BoM, you don't specify versions in Firebase library dependencies
    implementation ("com.google.firebase:firebase-database:20.0.3")

    //navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.5")

    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //circle indicator
    implementation ("me.relex:circleindicator:2.1.6")

    //material
    implementation ("com.google.android.material:material:1.10.0")

    //date picker
    implementation ("com.github.swnishan:materialdatetimepicker:1.0.0")

    //swipe to delete
    implementation ("it.xabaras.android:recyclerview-swipedecorator:1.4")

    //AvatarImageGenerator
    implementation ("com.github.amoskorir:avatarimagegenerator:1.5.0")

    //picasso
    implementation ("com.squareup.picasso:picasso:2.8")

    //relativelayouts
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    // Image Loading
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")

    //Support Library
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("androidx.gridlayout:gridlayout:1.0.0")

    //Card stack view
    //implementation (project(":cardstackview"))
    implementation ("com.github.yuyakaido:CardStackView:2.3.4")


    //circle progress bar
    implementation ("com.github.jakob-grabner:Circle-Progress-View:1.4")
    //easy flip view
    implementation ("com.wajahatkarim:EasyFlipView:3.0.3")

    //lottie
    implementation ("com.airbnb.android:lottie:6.2.0")

    //bottom sheet
    implementation ("com.github.Kennyc1012:BottomSheetMenu:5.1")

    //popup dialog
    implementation ("com.saadahmedev.popup-dialog:popup-dialog:1.0.5")

    //glide image
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //simple search view
    implementation ("com.github.Ferfalk:SimpleSearchView:0.2.1")

    implementation ("com.google.code.findbugs:jsr305:3.0.2")
    implementation ("org.conscrypt:conscrypt-android:2.5.2")
    implementation ("com.github.Kennyc1012:BottomSheetMenu:5.1.1")
}