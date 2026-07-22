# No Death XP Drop

Players never drop XP orbs on death — independent of the `keepInventory` gamerule.

Pairs with [Total Levels Tracker](https://github.com/CRAZYLAZYAZY/total-levels-tracker): without this mod, dying and walking back to pick up your own dropped orbs would re-trigger `addExperience()` and inflate the lifetime total for XP that was never actually new. This closes that loophole at the source.

![](examples/no-xp.png)

## Features

- Zero XP orbs dropped on player death
- Works independently of `keepInventory`
- One mixin: `ServerPlayerEntity` death handler
- No configuration needed — install and forget

## Compatibility

| | |
|---|---|
| Minecraft | 1.21.11 |
| Loader | Fabric 0.19.3+ |
| Dependencies | None |
| Server/Client | Both (server-side only) |

## Install

1. Download the `.jar` from [Modrinth](https://modrinth.com/mod/no-death-xp-drop) or [CurseForge](https://curseforge.com/minecraft/mc-mods/no-death-xp-drop)
2. Drop into `mods/` folder
3. Done. No config, no commands.

## License

MIT
