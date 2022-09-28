# shellscripts

Collection of personal wrapper and helper scripts.

### cheat <cmd>
Curl wrapper for cheat.sh  
Usage: `cheat <command>` to curl usage examples from cheat.sh

### crun
C version of go run.  
Usage: `crun <filename>` instead of `gcc <filename> -o "filename-ELF" && ./"filename-ELF"`

### ffd
Fuzzy Find Directory  
FZF wrapper for interactively finding and cd-ing to a dir inside of my projects/* folder

### cdi
Change Directoory interactively  
Usage: `cdi` to search recursively for partial dirnames from ./** then  cd into them
Requires shell alias `alias cdi='. cdi'`

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
