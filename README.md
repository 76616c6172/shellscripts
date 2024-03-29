# shellscripts

Collection of personal wrapper and helper scripts.

### cheat <cmd>
Curl wrapper for cheat.sh  
Usage: `cheat <command>` to curl usage examples from cheat.sh

### crun
C version of go run.  
Usage: `crun <filename>` instead of `gcc <filename> -o "filename-ELF" && ./"filename-ELF"`

### fd
Fuzzy Find Directory  
FZF wrapper for interactively finding and cd-ing to a dir inside of my projects/* folder

### cdi
Change Directoory interactively  
Usage: `cdi` to search recursively for partial dirnames from ./** then  cd into them
Requires shell alias `alias cdi='. cdi'`


### nix-env-wrapper
Combines best of both declarative and imperative package management.
Thank you to https://gist.github.com/danbst

depends on: nix-env package manager

 Usage:
 nix-env_wrapper install nixpkg.<package_name>
 nix-env_wrapper uninstall nixpkg.<package_name>
 nix-env_wrapper list

 package configuration is saved in ~/.config/nixpkgs/declarative as a human readable list (as well as for use with this script)
 and in ~/.config/nixpkgs/declarative-env.nix for easy portability and configuration on a new system!


### nms
Network Manager Status  
Scriptable alias for `nmcli device status`

### vpn_toggle
Wrapper for wireguard, toggles the connection of the wg0 interface

### grab_audio
Wrapper for youtube-dl (simplifies extracting audio from video sources)

### grab_video
Wrapper for youtube-dl (simplifies downloading videos)

# Do whatever you want license
Software is provided without warranty and the software author/license owner cannot be held liable for damages.
