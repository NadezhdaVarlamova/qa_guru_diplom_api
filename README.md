# Проект автоматизации API тестирования для <a target="_blank" href="https://reqres.in/">reqres.in</a>

## :open_book: Содержание:
- [Технологии и инструменты](#gear-в-проекте-используются-следующие-технологии-и-инструменты)
- [Что проверяем](#heavy_check_mark-что-проверяем)
- [Запуск тестов из Jenkins](#-запуск-тестов-из-jenkins)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Отчеты](#bar_chart-отчеты-о-прохождении-тестов-доступны-в-allure)
- - [Allure](#-allure)
- - [Telegram](#-telegram)
- [Allure TestOps](#-проект-интегрирован-с-allure-testOps)

## :gear: В проекте используются следующие технологии и инструменты:

<p align="center">
<img src="img/logo/Idea.svg" width="50" height="50"  alt="IDEA"/>
<img src="img/logo/Java.svg" width="50" height="50"  alt="Java"/>
<img src="img/logo/GitHub.svg" width="50" height="50"  alt="Github"/>
<img src="img/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="img/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="img/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="img/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="img/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/>
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
<img src="img/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/>
</p>

## :heavy_check_mark: Описание
В проекте автоматизирована проверка API запросов на сайте reqres.in.

## :heavy_check_mark: Что проверяем

> - Успешная регистрация пользователя;
> - Не успешная регистрация пользователя;
> - Обновление пользователя;
> - Удаление пользователя;
> - Запрос несуществующего пользователя.

## <img width="4%" title="Jenkins" src="img/logo/Jenkins.svg"> Запуск тестов из [Jenkins](https://jenkins.autotests.cloud/job/VarlamovaNadezhda_qa_guru_10_diplom_api/)

Для запуска тестов из Jenkins:
1. Необходимо нажать кнопку "Собрать сейчас".
<img src="img/screen/Запуск.jpg" alt="Jenkins"/>

## :computer: Запуск тестов из терминала

Для локального запуска необходимо выполнить команду:
```
gradle clean test
```

## :bar_chart: Отчеты о прохождении тестов доступны в Allure

### <img width="3%" title="Allure" src="img/logo/Allure.svg"> Allure

#### Главная страница

<img src="img/screen/AllureMain.jpg" alt="Allure"/>

#### Графики

<img src="img/screen/AllureGraph.jpg" alt="Allure"/>

#### Тесты

<img src="img/screen/AllureTests.jpg" alt="Allure"/>

### <img width="3%" title="Telegram" src="img/logo/Telegram.svg"> Telegram

Настроена отправка оточета ботом в Telegram

<img src="img/screen/Bot.jpg" alt="Telegram"/>

## Проект интегрирован с Allure TestOps
<img width="3%" title="Allure" src="img/logo/Allure_TO.svg"> 

#### Представлены тест-кейсы

<img src="img/screen/TOTest.jpg" alt="TO"/>

#### Представлены дашборды аналитики

<img src="img/screen/TODash.jpg" alt="TO"/>

#### Представлены запуски

<img src="img/screen/TOLaunch.jpg" alt="TO"/>

