# Projet Hibernate 

# TP1:Application pour la gestion des produits

Le TP1 est une application de gestion de produits conçue pour mettre en pratique les principes d'Hibernate et de persistance de données en Java. Il met en œuvre diverses fonctionnalités, notamment la création d'une entité `Produit` avec des annotations Hibernate, la configuration de Hibernate via un fichier `hibernate.cfg.xml`, et bien plus encore.

## Fonctionnalités

Ce projet comprend les fonctionnalités suivantes :

- **Création d'une entité `Produit` :** L'application utilise des annotations Hibernate pour définir l'entité `Produit`, qui représente les informations sur les produits stockés en base de données.

- **Configuration de Hibernate :** Hibernate est configuré via un fichier `hibernate.cfg.xml` pour gérer la persistance des données et la connexion à la base de données.

- **Classe `HibernateUtil` :** Une classe `HibernateUtil` est mise en place pour gérer la SessionFactory, facilitant ainsi la gestion des sessions Hibernate.

- **Interface `IDao` :** Une interface `IDao` est créée pour définir les opérations de base de création, mise à jour, suppression et recherche des produits.

- **Classe de service `ProduitService` :** La classe `ProduitService` est développée pour implémenter les opérations définies dans l'interface `IDao`, offrant ainsi une couche de service pour la gestion des produits.

- **Tests complets :** Des tests sont inclus pour valider les opérations de création, modification, suppression et recherche de produits, garantissant ainsi la robustesse de l'application.

-> Diagramme de classe

![image](https://github.com/nainiaasmaa/TP-HIBERNATE/assets/147659638/2b66b014-a8cc-4180-b25f-9d06cd7dabba)


# TP3:Application de gestion de projet

Le TP3 consiste créer une application de gestion de projets mettant en pratique l'utilisation avancée d'Hibernate. Il englobe diverses fonctionnalités pour la gestion des projets, des tâches et des employés, en utilisant des annotations Hibernate et en mettant en œuvre une architecture robuste.

## Fonctionnalités

Le TP3 comprend les fonctionnalités suivantes :

- **Création de classes entités :** Des classes entités sont créées pour les projets, les tâches et les employés, toutes annotées avec Hibernate pour une correspondance précise avec la base de données.

- **Configuration de Hibernate :** Hibernate est configuré via un fichier `hibernate.cfg.xml` pour gérer la persistance des données et la connexion à la base de données.

- **Classe `HibernateUtil` :** Une classe `HibernateUtil` est mise en place pour gérer la SessionFactory, simplifiant ainsi la gestion des sessions Hibernate.

- **Interfaces génériques `IDao` :** Une interface générique `IDao` est conçue pour définir les opérations de base, et des classes de service distinctes (ProjetService, TacheService, EmployeService, EmployeTacheService) sont implémentées pour chaque entité.

- **Implémentation de diverses méthodes :** Diverses méthodes sont mises en œuvre pour gérer les projets, les tâches et les employés, notamment la création, la modification, la suppression et la recherche d'informations.

- **Tests complets :** Des tests complets sont inclus pour vérifier le bon fonctionnement de toutes les fonctionnalités, assurant la robustesse et la fiabilité de l'application de gestion de projets.

-> Diagramme de classe

![image](https://github.com/nainiaasmaa/TP-HIBERNATE/assets/147659638/91ca3b89-21a6-44b9-b68e-9c6adefa6452)
