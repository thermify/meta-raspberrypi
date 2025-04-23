DESCRIPTION = "A collection of scripts and simple applications"
HOMEPAGE = "https://github.com/raspberrypi/utils"
SECTION = "utilities"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=4c01239e5c3a3d133858dedacdbca63c"

COMPATIBLE_MACHINE = "^rpi$"

DEPENDS = "dtc"

FILES:${PN} += "/usr/share/bash-completion/completions/vcgencmd /usr/share/bash-completion/completions/pinctrl"

RDEPENDS:${PN} += "coreutils perl bash"

# https://github.com/raspberrypi/userland is a deprecated repo 
RCONFLICTS:${PN} = "userland"

inherit cmake

SRCREV = "f92b9735ba3141103c73cd0bf9781644caa91e42"
SRC_URI = "git://github.com/raspberrypi/utils.git;protocol=https;branch=master \
           file://0001-Patch-path-to-env-for-Yocto-alternative-detection.patch \
           "

S = "${WORKDIR}/git"

