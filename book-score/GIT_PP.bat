@echo off
title git_set

set url=heyyouhub/test.git


:loop
echo --------------------------
echo git push/pull/clone
echo --------------------------
set /p u=U : 
if %u%==push goto push
if %u%==pull goto pull
if %u%==clone goto clone
if %u%==update goto update
cls goto loop

:push
title push
git init
set /p c=commit : 
git add .
git commit -m "%c%"
git remote add origin https://github.com/%url%
git push -u origin master
pause
exit

:pull
title pull
git remote add origin https://github.com/%url%
git pull origin master
pause
exit

:clone
title clone
git clone https://github.com/%url%
pause
exit

