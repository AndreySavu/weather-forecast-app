Java-микросервис, который получает прогноз погоды на
заданное клиентом число дней из внешнего ресурса/сервиса(но сейчас заглушка).

Инструкция по сборке и развертыванию:

1. Собираем докер-образ
```bash
docker build -t weather-forecast-app .   
```
2. Запускаем контейнер
```bash
docker run -p 8080:8080 weather-forecast-app
```
