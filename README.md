# Мобильная автоматизация - урок 37

На этом занятии мы научимся запускать тесты на Android.

## План:

- Обсудим основные отличия мобильной автоматизации от веба
- Поговорим о стеке мобильной автоматизации
- Установим все необходимые программы
- Установим необходимые библиотеки
- Обсудим версионирование библиотек
- Создадим главный класс нашего проекта в IDE
- Научимся подбирать локаторы Android в Appium Viewer
- Напишем несколько тестов
- Добавим наш проект на Github

## Мобильная автоматизация - урок 38

На этом занятии мы научимся запускать тесты на iOS. 

Также, будем учиться писать универсальные тесты для обеих платформ.

### План:

- Обсудим отличие запуска тестов на Android и iOS
- Соберем нужную конфигурацию библиотек и программ
- Напишем первый тест на iOS
- Поговорим про PageObject
- Научимся писать универсальные тесты, работающие под Android и iOS


## Описание

На вебинарах будет довольно много работы со скачиванием, настройками и так далее. 

Я буду подробно рассказывать о том, что мы устанавливаем, зачем мы это делаем и как это связано с основным проектом.

Я предлагаю слушать, не пытаясь повторять, так как вы непременно отстанете и с трудом будете понимать, что происходит дальше.

Вместо этого на самом вебинаре стоит сосредоточиться на понимании того, что я рассказываю. А уже повторять следует по видеозаписи в домашнем режиме.

Для автоматизации мы выбрали проект Wikipedia. В качестве домашнего задания мы предложим написать несколько тестов для этого приложения.

## Необходимый софт

- Appium Desktop https://github.com/appium/appium-desktop/tags
- Maven https://maven.apache.org/install.html
- Android Studio https://developer.android.com/studio

## Содержимое репозитория:

- pom-xml - основной конфиг Maven
- apps/ - приложение Википедии для тестирования
- src/test/java/tests/ - директория с тестами
- src/test/java/lib/ - директория со вспомогательными классами
-- CoreTestCase.java - родительыский класс для тестов
- src/test/java/lib/ui/  - директория с PageObject-классами
-- PlatformSelector.java - класс с указанием платформы для запуска
- src/test/java/lib/ui/pages/ - директория в PageObject-классами


## История репозитория

- Чтобы получить версию репозитория для первого вебинара, необходимо выполнить команду: git checkout "Webinar 1"
- - Чтобы получить версию репозитория для второго вебинара, необходимо выполнить команду: git checkout "Webinar 2"
