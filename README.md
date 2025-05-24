# 🚀 partner-service

📘 **Spring Boot микросервис** для управления партнёрами. Поддерживает REST API, работу с базой данных MySQL и интеграцию с Kafka.

---

## 📦 Структура проекта и описание компонентов

### `PartnerServiceApplication.java`
Главный класс, точка входа в приложение. Запускает Spring Boot приложение.

### `controller/PartnerController.java`
REST API для управления партнёрами:
- `GET /partners` — получить всех партнёров
- `POST /partners` — добавить нового партнёра
- `PUT /partners/{id}` — обновить партнёра
- `DELETE /partners/{id}` — удалить партнёра

### `controller/KafkaController.java`
Контроллер для отправки сообщений в Kafka.  
Метод `POST /send` — отправляет строку в топик Kafka.

### `kafka/KafkaProducerService.java`
Kafka-продюсер — отправляет сообщения в указанный топик.

### `kafka/KafkaConsumerService.java`
Kafka-консьюмер — слушает сообщения из Kafka и логирует их.

### `model/Partner.java`
Сущность `Partner` — отражает таблицу `partners` в базе данных.
Поля:
- `id` — идентификатор
- `name`, `director`, `address`, `phone`, `fax` — данные партнёра

### `repository/PartnerRepository.java`
Интерфейс для доступа к данным из MySQL. Наследуется от `JpaRepository`.

---

## ⚙️ Конфигурация

### `application.properties`
Настройки подключения к базе данных, Kafka и другим компонентам.

### `docker-compose.yml`
Запускает Kafka и Zookeeper в контейнерах через Docker.

---
## 🧪 Тесты
- PartnerServiceApplicationTests.java
- Базовые тесты для запуска контекста Spring Boot.
