# GitHub Users

An Android client for the GitHub API: a list of users, a user profile, the user's
repositories and repository details. Data is cached in a local database,
so the app also works without a network connection. The project is built on the classic
MVP + RxJava + Dagger 2 stack.

## Features

- List of GitHub users with avatars
- User profile and the list of their repositories
- Repository details
- Offline mode: users, repositories and avatars are cached in Room
  and on disk, and the data source is chosen based on network state
- Image converter: pick an image from the gallery and save it as PNG

## Tech stack

| Area           | Technologies                                     |
|----------------|--------------------------------------------------|
| Language       | Kotlin                                           |
| Architecture   | MVP (Moxy)                                       |
| Navigation     | Cicerone                                         |
| DI             | Dagger 2 (dagger-android)                        |
| Concurrency    | RxJava 2, RxKotlin, RxAndroid                    |
| Networking     | Retrofit, OkHttp, Gson                           |
| Storage        | Room (RxJava adapter)                            |
| Images         | Glide                                            |
| UI             | ViewBinding, Material Components, RecyclerView   |
| Logging        | Timber                                           |

## Project structure

```
app/src/main/java/com/tlenparty/popularlibraries/
├── api/            # Retrofit interface for the GitHub API, interceptors
├── baselogic/      # screens: MainActivity, users, user, user_repositories
├── converter/      # image converter
├── di/             # Dagger component and modules
├── framework/ui/   # adapters, image loading
├── helpers/        # network, Rx schedulers, Cicerone screens
├── model/
│   ├── db/         # Room: entities, DAOs, cache
│   ├── entites/    # API models
│   └── repositories/
├── RxPlayground.kt     # sandbox with RxJava examples
└── test_dagger/        # sandbox with Dagger examples
```

## Build

Requires JDK 11–17 and Android SDK 31.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
