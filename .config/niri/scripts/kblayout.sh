#!/bin/bash

# 1. Troca o layout
niri msg action switch-layout next

# 2. Pequena pausa para o Niri atualizar
sleep 0.05

# 3. Pega o índice (0 ou 1)
INDEX=$(niri msg keyboard-layouts | grep '\*' | awk '{print $2}')

# 4. Converte o índice para o nome legível
if [ "$INDEX" = "0" ]; then
    LAYOUT="US"
elif [ "$INDEX" = "1" ]; then
    LAYOUT="BR"
else
    LAYOUT="??"
fi

# 5. Envia a notificação
notify-send -a "System" -c "keyboard" "Teclado" "Layout: $LAYOUT" -t 1000
