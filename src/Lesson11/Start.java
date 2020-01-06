package Lesson11;

import Lesson11.Action.Application;
import Lesson11.Action.ConsoleApplication;

public class Start {
    public static void main(String[] args) {
        Application app = new ConsoleApplication();
        app.run();


        // Multitier Архитектура
            // User взаимодействует с Action. Action с Service (Калькулятор). Service - обратно к Action либо в репозиторий.
//        --------------------------
        // Clean Code Архитектура

//     1. Переделать структуру папок.
// ! Actions (UserAction использует сервисы Registration и Authotization, которые взаимодействуют с Entities) - использует Utilities. Здесь же и главное App.
//         Actions используются для того, чтобы связываться с Services. Слой взаимодействия с пользователем.
//
// Services (ConsoleCalculator, Reg, Aut) - Use Cases (Clean Code) - не использует Utilities
//         Services используются для того, чтобы работать с Entities

// ! Entities (User) - Entities (Clean Code)
//        Entities - это доменные сущности приложения
//
// Utilities (Reader, Writer, Messages)
//        Utilities - для внутреннего удобства



            // Controllers (то же самое, что и Actions)


//      App->Actions->Services->Entities


//      Функции Меню - в ConsoleApplication

//     2. UserAction - к пакету Action
        //  Action - только void методы
//     3. User - к доменным сущностям (Entities)
        // 4 Сервисы - кулькулятор.
        // 5. Репозиторий - для данных
        // 6. Обработчик запросов пользователя - вместо того, чтобы всё делать в меню
        // 7.


    }



}
