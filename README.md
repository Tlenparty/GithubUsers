# GitHub Users

Android-клиент для GitHub API: список пользователей, профиль, репозитории
пользователя и детали репозитория. Данные кешируются в локальной базе,
поэтому приложение работает и без сети. Проект построен на классическом
стеке MVP + RxJava + Dagger 2.

## Возможности

- Список пользователей GitHub с аватарами
- Профиль пользователя и список его репозиториев
- Детальная информация о репозитории
- Офлайн-режим: пользователи, репозитории и аватары кешируются в Room
  и на диск, источник выбирается по состоянию сети
- Конвертер изображений: выбор картинки из галереи и сохранение в PNG

## Стек

| Область        | Технологии                                       |
|----------------|--------------------------------------------------|
| Язык           | Kotlin                                           |
| Архитектура    | MVP (Moxy)                                       |
| Навигация      | Cicerone                                         |
| DI             | Dagger 2 (dagger-android)                        |
| Асинхронность  | RxJava 2, RxKotlin, RxAndroid                    |
| Сеть           | Retrofit, OkHttp, Gson                           |
| Хранение       | Room (RxJava-адаптер)                            |
| Изображения    | Glide                                            |
| UI             | ViewBinding, Material Components, RecyclerView   |
| Логирование    | Timber                                           |

## Структура

```
app/src/main/java/com/tlenparty/popularlibraries/
├── api/            # Retrofit-интерфейс GitHub API, интерсепторы
├── baselogic/      # экраны: MainActivity, users, user, user_repositories
├── converter/      # конвертер изображений
├── di/             # Dagger-компонент и модули
├── framework/ui/   # адаптеры, загрузка изображений
├── helpers/        # сеть, планировщики Rx, экраны Cicerone
├── model/
│   ├── db/         # Room: сущности, DAO, кеш
│   ├── entites/    # модели API
│   └── repositories/
├── RxPlayground.kt     # песочница с примерами RxJava
└── test_dagger/        # песочница с примерами Dagger
```

## Сборка

Требуется JDK 11–17 и Android SDK 31.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
