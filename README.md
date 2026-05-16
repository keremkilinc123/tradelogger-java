# TradeLogger

A lightweight Java-based trade logging utility designed for recording transaction events and maintaining in-memory session history.

## Overview

TradeLogger is a simple logging system built in Java that demonstrates file operations, session-based memory management, and structured trade event recording.

The application writes trade events to a persistent log file while also storing recent session activity in memory with automatic size management.

## Features

- Persistent trade logging
- In-memory session history tracking
- Automatic history size management
- Buffered file writing
- Exception handling
- Lightweight and modular structure

## Technologies

- Java
- File I/O
- BufferedWriter
- Collections Framework

## Project Structure

```bash
Main.java
TradeLogger.java
trades.log
```

## How It Works

- Trade events are written to `trades.log`
- Recent trade IDs are stored in memory
- Session history automatically removes old entries after reaching the maximum limit

## Example

```text
ID: T1 - Sample trade
```

## Run

Compile:

```bash
javac Main.java TradeLogger.java
```

Run:

```bash
java Main
```

## Purpose

This project was created to practice Java file handling, logging systems, and basic backend-oriented software design concepts.
