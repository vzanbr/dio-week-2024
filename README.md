# santander-week-2024

## Diagrama de classe

```mermaid
classDiagram
    class User {
        +String name
    }
    
    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }
    
    class Feature {
        +String icon
        +String description
    }
    
    class Card {
        +String number
        +float limit
    }
    
    class News {
        +String icon
        +String description
    }

    User --> Account : has
    User --> Feature : has many
    User --> Card : has
    User --> News : has many
```
