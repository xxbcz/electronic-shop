**Запуск и небольшой коммент по тестовому.**

В рамках задачи требовалось создать 5 разных сущностей. Под каждую сущность был создан свой функционал,
что добавило много похожего кода. В зависимости от задачи и размера приложения, можно было создать единую
сущность со ссылкой на уникальные данные (в формате json) и хранить общие данные в одной таблице,
а уникальные во второй ссылаясь на нее, либо все в одной. Так же в текущем приложении можно было использовать один
единый контроллер, так как много общей логики, все зависит от проекта и расширяемости в будущем. Для отображения и
создания сущностей используется одна модель, так как уникальных (данные не для покупателей) данных при добавлении
данных в бд не используется. В ином случае модели запроса и ответа сделал бы разные.

**О реализации**

Сортировка задается при отправке параметра ASK или DESC в теле запроса, если не указываем поле сортировки, будет ASC.

Фильтры можно комбинировать, как угодно, друг с другом.

Фильтр по наименованию работает по like(кратно символу) и не чувствителен к регистру.(fullDescriptionType)

!Остальные фильтры чувствительны к регистру!

Если фильтр пустой, вернутся все товары, которые есть.

Если фильтр не передан, вернутся все товары, которые есть в наличии.

Значения пагинации указываются в application.yml, если передавать не корректные значения или больше допустимого, будет исправлено на стандартные. 

**Запуск**

1. Создать базу данных по адресу jdbc:postgresql://localhost:5432/electronic-shop логин/пароль: postgres
2. Подтянуть все зависимости
3. Собрать проект в мавен
4. Выполнить вручную SQL код в файле data.sql
5. Запустить приложение ElectronicShopApplication.
6. Swagger находится по адресу http://localhost:8080/swagger-ui/index.html