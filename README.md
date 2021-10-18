# Spigot plugin runCmd

Minecraft Spigot plugin to run commands in-game on server machine.

## Usage

WARNING: The plugin runs on the same thread as the server, do not run thread-blocking commands like commands that require user interaction

- `/run <command>` - Run \<command> in the host machine

## Compatibility

Works in windows via cmd.exe and linux via sh

This plugin was made with spigot 1.16.5 in mind, but it doesn't use any spigot-only funcionality, so it should work on any bukkit fork.

Tested only in minecraft 1.16.5 but should work in other versions since it doesn't do anything version-specific

## Download

You can download the built jar in the [releases page](https://github.com/daviirodrig/runCmd/releases)
