# Singly Linked List Implementation in Java

This repository contains a simple Java implementation of a Singly Linked List with various operations like insertion, deletion, and displaying the list. The program is interactive and presents a menu-driven interface where users can perform various linked list operations from the console.

## Features

- **Insert at the Beginning**: Insert a new node at the start of the list.
- **Insert at the End**: Insert a new node at the end of the list.
- **Insert at a Specific Position**: Insert a new node at a specified position.
- **Delete a Node**: Delete a node based on its value.
- **Display the List**: Display the entire linked list.

## Data Structure

The linked list is implemented using a custom `LinkedList` class and a `Node` class:

### `Node` Class
- **data**: Stores the value for the node.
- **next**: A reference to the next node in the list.

### `LinkedList` Class
- **head**: A reference to the first node of the list.
- The `LinkedList` class contains the following methods:
  - `insertAtBeginning(int value)`: Inserts a new node at the beginning of the list.
  - `insertAtEnd(int value)`: Inserts a new node at the end of the list.
  - `insertAtPosition(int value, int pos)`: Inserts a new node at the specified position.
  - `deleteNode(int value)`: Deletes a node with the given value.
  - `display()`: Displays all nodes in the list.

## How to Use

### Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/EnzoLeman/SinglyLinkedList.git
