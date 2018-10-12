Feature: feature name

Scenario: Проверка количества вакансий на ITPage
Given Открыть HomePage volia.com
When В блоке menu выбрать «Світ Волі»
And  На CompanyPage в блоке menu main кликнуть по «Вакансіі»
And  На VacanciesPage в сайдбаре выбрать IT
Then Проверить, что на ITPage отображается 2 вакансии

Scenario: Ошибка авторизации в Мой кабинет
Given Открыть HomePage volia.com
When В login-block кликаем на Мій кабінет
And На странице с формой вводим Номер договору або email - '37373'
And Вводим Password - 'bd86'
And Кликаем чекбокс - Запам'ятати мене - и отправляем форму
Then Сравниваем полученный результат с ожидаемым - 'Дані не збіглися'