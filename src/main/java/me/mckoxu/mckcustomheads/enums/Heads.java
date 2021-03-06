package me.mckoxu.mckcustomheads.enums;

import me.mckoxu.mckcustomheads.utils.HeadsCreating;
import org.bukkit.inventory.ItemStack;

public enum Heads {
	//FOOD, DRIKNS AND PLANTS
	CHEESE("OTU1ZDYxMWE4NzhlODIxMjMxNzQ5YjI5NjU3MDhjYWQ5NDI2NTA2NzJkYjA5ZTI2ODQ3YTg4ZTJmYWMyOTQ2In19fQ==", "food-cheese"),
	JAM("YzBiOGI1ODg5ZWUxYzYzODhkYzZjMmM1ZGJkNzBiNjk4NGFlZmU1NDMxOWEwOTVlNjRkYjc2MzgwOTdiODIxIn19fQ==", "food-jam"),
	CAKE("ZjkxMzY1MTRmMzQyZTdjNTIwOGExNDIyNTA2YTg2NjE1OGVmODRkMmIyNDkyMjAxMzllOGJmNjAzMmUxOTMifX19", "food-cake"),
	PANCAKE("MzQ3ZjRmNWE3NGM2NjkxMjgwY2Q4MGU3MTQ4YjQ5YjJjZTE3ZGNmNjRmZDU1MzY4NjI3ZjVkOTJhOTc2YTZhOCJ9fX0=", "food-pancake"),
	MILK("ZDdhYjYyZmI3NzE4OTM1MjU0MWRkOTVhOGVlN2UzNjMxZjdjMTY1OGY0NjNmNjYxNjgwYzI4MzQ5M2Q4YSJ9fX0=", "food-milk"),
	COOKIE("YjU5MmNmOWY0MmE1YThjOTk1OTY4NDkzZmRkMWIxMWUwYjY5YWFkNjQ3M2ZmNDUzODRhYmU1OGI3ZmM3YzcifX19", "food-cookie"),
	CHOCOLATE("ODE5Zjk0OGQxNzcxOGFkYWNlNWRkNmUwNTBjNTg2MjI5NjUzZmVmNjQ1ZDcxMTNhYjk0ZDE3YjYzOWNjNDY2In19fQ==", "food-chocolate"),
	CHERRY("ZDUyNTcwNzY5NmJjZDE1YTE3MzA1NmZhMzkyOTZlODBmZjQxMTY4YmIwYWRkNTUyZjQ1MjNlMjU1OGEzMTE5In19fQ==", "food-cherry"),
	APPLE("MzVlMmUwOTU5NzEyZGNkMzM1N2NjM2NlYTg1Zjk5YjNmZDgwOTc4NTVjNzU0YjliMTcxZjk2MzUxNDIyNWQifX19", "food-apple"),
	MELON("MjQxNDEyYjhjNmZkNTdlNGUxNjIxNjZkZGZkNzRiMTQ4YTU5NmY5ZWIxZDE1OTNjMDQ2OTYzOGM4ZDcxNCJ9fX0=", "food-melon"),
	PUMPKIN("ZDdkN2FkMmRjYjU3ZGZhOWYwMjNkYmI5OWI2OThmYzUzMDc1YzNlOWQ2NTQ1MDYxMzlhNjQ3YWM5MDdmZGRjNSJ9fX0=", "food-pumpkin"),
	STRAWBERRY("Y2JjODI2YWFhZmI4ZGJmNjc4ODFlNjg5NDQ0MTRmMTM5ODUwNjRhM2Y4ZjA0NGQ4ZWRmYjQ0NDNlNzZiYSJ9fX0=", "food-strawberry"),
	COCONUT("MzJjNjJmZDhlNDc0ZDA5OTQwNjA0ZjgyNzEyYTQ0YWJiMjQ5ZDYzYWZmODdmOTk4Mzc0Y2E4NDlhYjE3NDEyIn19fQ==", "food-coconut"),
	SUGARCANE("MzNjYTlkOGIxZDVmMmMyNjU0NzY0NDAzNGE1NWE0YTI0NjNlMTY2ZjYwZmViMGM3YzVhZjNmNzI0YmFlIn19fQ==", "food-sugarcane"),
	TEA("ZDhlOTRkZGQ3NjlhNWJlYTc0ODM3NmI0ZWM3MzgzZmQzNmQyNjc4OTRkN2MzYmVlMDExZThlNGY1ZmNkNyJ9fX0=", "food-tea"),
	TACO("OThjZWQ3NGEyMjAyMWE1MzVmNmJjZTIxYzhjNjMyYjI3M2RjMmQ5NTUyYjcxYTM4ZDU3MjY5YjM1MzhjZiJ9fX0=", "food-taco"),
	POTATOE("NmYzMTJhMjQzYWE0ZTY5YTVlZGM2N2U1NGU0NGY3NmViODRmNjZlYzgyNDA4OTU1N2E2NGJlYTcxZjZkYyJ9fX0=", "food-potatoe"),
	CHIPS("YTBlYWNhYzQxYTllYWYwNTEzNzZlZjJmOTU5NzAxZTFiYmUxYmY0YWE2NzE1YWRjMzRiNmRjMjlhMTNlYTkifX19", "food-chips"),
	HAMBURGER("YTZlZjFjMjVmNTE2ZjJlN2Q2Zjc2Njc0MjBlMzNhZGNmM2NkZjkzOGNiMzdmOWE0MWE4YjM1ODY5ZjU2OWIifX19", "food-hamburger"),
	POPCORN("MTQ5N2IxNDdjZmFlNTIyMDU1OTdmNzJlM2M0ZWY1MjUxMmU5Njc3MDIwZTRiNGZhNzUxMmMzYzZhY2RkOGMxIn19fQ==", "food-popcorn"),
	COKE("ZTliNDFlOWZlNTQzZjIzNzVkMGE5N2RkNTkyMmU0ZDY1YjhhNTIzYmFmMjI2NWQ0MjM5OGQ2NGMzNjRlZjk1In19fQ==", "food-coke"),
	BEER("NDA1M2UyNjg2N2JiNTc1MzhlOTc4OTEzN2RiYmI1Mzc3NGUxOGVkYTZmZWY1MWNiMmVkZjQyNmIzNzI2NCJ9fX0=", "food-beer"),
	ORANGEFRUIT("NjViMWRiNTQ3ZDFiNzk1NmQ0NTExYWNjYjE1MzNlMjE3NTZkN2NiYzM4ZWI2NDM1NWEyNjI2NDEyMjEyIn19fQ==", "food-orange"),
	SUSHI("MmVlYzc2NDBlNDMyNDBjODE2N2IxNjc3ZWFiZmZhYWQ5ZjYyODA2Y2NiZTI2NzMyNGM5N2NlYjcyOWQzMDNhIn19fQ==", "food-sushi"),
	GRAPE("ZWU1OTM1ODYzYzUzYTk5NmY1MzM0ZTkwZjU1ZGU1MzhlODNmZmM1ZjZiMGI4ZTgzYTRkYzRmNmU2YjEyMDgifX19", "food-grape"),
	TOMATO("OTkxNzIyMjZkMjc2MDcwZGMyMWI3NWJhMjVjYzJhYTU2NDlkYTVjYWM3NDViYTk3NzY5NWI1OWFlYmQifX19", "food-tomato"),
	HAM("MjYzMzZmNWJiOTk3NWJmNTdlMTRkYjY2MTVjMTg5NmM1YzRiOWMzOWFhZDE3YjE3ZTRlZTIwYjIzMWNmNiJ9fX0=", "food-ham"),
	WATER("Njk2Yjc0MjQ5Y2MxNWNlZmU0NjI0YmU2N2FlODYxZGYyZmU2NGVlNmFjN2Y0NjIzNjNkOTBjY2E5NDgxNTM5In19fQ==", "food-water"),
	BLUEBERRY("MWIxODcwNGFhMGM5MmFiN2YzMDY1YjNlMzg0OTZkZDFjZDQyZjkzYjExODNhM2ZiNGYyNmI0ZThkOTk5YWUifX19", "food-blueberry"),
	LEMON("NmVjNjI4OGQ5NWQyYzQzOWRkZTZiNWI2Nzc4OGY4ZDA3NjJmNGNlYTExN2E0MGJmNTEyZGM2Y2ZhNzU2MWFhIn19fQ==", "food-lemon"),
	BREAD("ZjM0ODdkNDU3ZjkwNjJkNzg3YTNlNmNlMWM0NjY0YmY3NDAyZWM2N2RkMTExMjU2ZjE5YjM4Y2U0ZjY3MCJ9fX0=", "food-bread"),
	ONION("YTZlY2M0NmRjM2RjODVmY2Q1NzE5ODE3NmVlODQxZjFhMDQxYjE1ZjczZWNiMTlmZGU2MmVlNDMxNWM0YTYifX19", "food-onion"),
	//COLORS 
	WHITE("ZTVhNzcwZTdlNDRiM2ExZTZjM2I4M2E5N2ZmNjk5N2IxZjViMjY1NTBlOWQ3YWE1ZDUwMjFhMGMyYjZlZSJ9fX0=", "color-white"),
	BLACK("OWRkZWJiYjA2MmY2YTM4NWE5MWNhMDVmMThmNWMwYWNiZTMzZTJkMDZlZTllNzQxNmNlZjZlZTQzZGZlMmZiIn19fQ==", "color-black"),
	GRAY("ZjJmMDg1YzZiM2NiMjI4ZTViYTgxZGY1NjJjNDc4Njc2MmYzYzI1NzEyN2U5NzI1Yzc3YjdmZDMwMWQzNyJ9fX0=", "color-gray"),
	LIGHTGRAY("MzFjNDVhNTk1NTAxNDNhNDRlZDRlODdjZTI5NTVlNGExM2U5NGNkZmQ0YzY0ZGVlODgxZGZiNDhkZDkyZSJ9fX0=", "color-lightgray"),
	BROWN("NDU3NGE0Njc3MzcyOTViZDlkZGM4MjU0NWExYTRlMTQ2YTk0M2QwNWVjYzgyMWY5Y2M2YTU0M2ZmZTk5MzRhIn19fQ==", "color-brown"),
	MOKKA("YmFkNTk4M2RjYWJjOTMxYWI2YTQ5ZDJmYjg4NzllYmM1Mjk1Y2I1YmEyZjI3OGUzYzhhM2RhN2JjOGI0NzgifX19", "color-mokka"),
	CREAM("YmY3NjI5NDAxMWNiZGNkMmU5Mjk0MWRhZmU2YjM3MjZkZmYwMmMzZTFmODRkZmE1N2M2YWJhYjZmYzMzY2U2In19fQ==", "color-cream"), 
	BLUE("YzE0ODJiNzU1ODU4NjU3ZmI1MWI3ZDNmYmY0Y2Q4YzA5MGMwNWUzNWJkOGNkYmE5OGIxOTQ5OWQ3ODMzYWNiMiJ9fX0=", "color-blue"),
	BLUE2("NDg5Y2U4OTUyNmZjMTI2MjQ2NzhmMzA1NDkzYWE2NWRhOGExYjM2MDU0NmE1MDVkMTE4ZWIxZmFkNzc1In19fQ==", "color-blue2"),
	BLUE3("N2QzMWQyMWNiNTQyOTRlZTNhMjA1NjEzN2QxMjNiNTc2Zjc4YmZjNDg3OGNkODE0NGNkNTFlMTkzMWMzOWI1In19fQ==", "color-blue3"),
	BLUE4("M2IxOWRjNGQ0Njc4ODJkYmNhMWI1YzM3NDY1ZjBjZmM3MGZmMWY4MjllY2Y0YTg2NTc5NmI4ZTVjMjgwOWEifX19", "color-blue4"),
	BLUE5("YjgzOWUzODFkOWZlZGFiNmY4YjU5Mzk2YTI3NjQyMzhkY2ViMmY3ZWVhODU2ZGM2ZmM0NDc2N2RhMzgyZjEifX19", "color-blue5"),
	BLUE6("Yzk2NTQwY2U3NjIxMjVlMzk4Y2E1M2Q0Y2Q5YjY2ODM5NmQwNDY3ZTEyOGIzMGRhNWFhNjJiZTljZTA2MCJ9fX0=", "color-blue6"),
	BLUE7("MTIzMDZhOTg3ODdlNTI2Y2U5NzNiZDU2MTI0ZTY0NWEyZTIzMjlkNTYzZGNmYTY4YTFiZTY1NzY3ZjI5YjUifX19", "color-blue7"),
	CYAN("N2E5ZGI4NDllZTVkOWNjZTg3NTllNmM0M2JmYWZiZWFjNjE3ODJiNDRmOWY2MWNhZjM5ZmVmZWI3MzYzIn19fQ==", "color-cyan"),
	CYAN2("Yjc4NGMxNTJiZmMzZTJlMzEzZWYyM2ZjNDZkNDRmY2U0MWU0YWRhZDk0MjFiYWMyZGEzODk0NTExY2MwM2IifX19", "color-cyan2"),
	LIGHTGREEN("MzYxZTViMzMzYzJhMzg2OGJiNmE1OGI2Njc0YTI2MzkzMjM4MTU3MzhlNzdlMDUzOTc3NDE5YWYzZjc3In19fQ==", "color-lightgreen"),
	GREEN("MzZmNjlmN2I3NTM4YjQxZGMzNDM5ZjM2NThhYmJkNTlmYWNjYTM2NmYxOTBiY2YxZDZkMGEwMjZjOGY5NiJ9fX0=", "color-green"),
	GREEN2("Y2FkMDE1OTJjYTQ0MTg5ZjhhYmFkMGMyZWZhM2NhZTZhYWZhZTc2ZGFhYTdlYTQ2NjU1Y2MxMjkzNDg5ZmYifX19", "color-green2"),
	GREEN3("MTg1ZmM5N2M3ZGYyNGE2YWE5YzBhYzg5ZmNiMjJiODE3MDBmNTk5ZjQ1YzMyYzdlMzE3OGI0NDQxNzJkZiJ9fX0=", "color-green3"),
	GREEN4("MWNmM2U0MjJiMzIyYjFlOTI0NWI0YjM2ODQzMzA0NWM3YjQzYzkwOWU1ZGQ2Yzc5MmU0YjZiZWRhNTQzMDNjIn19fQ==", "color-green4"),
	RED("NGJhYzc3NTIwYjllZWU2NTA2OGVmMWNkOGFiZWFkYjAxM2I0ZGUzOTUzZmQyOWFjNjhlOTBlNDg2NjIyNyJ9fX0=", "color-red"),
	RED2("OTdjMWYxZWFkNGQ1MzFjYWE0YTViMGQ2OWVkYmNlMjlhZjc4OWEyNTUwZTVkZGJkMjM3NzViZTA1ZTJkZjJjNCJ9fX0=", "color-red2"),
	RED3("M2Y0NmMzMWQ2ZWU2ZWE2MTlmNzJlNzg1MjMyY2IwNDhhYjI3MDQ2MmRiMGNiMTQ1NDUxNDQzNjI1MWMxYSJ9fX0=", "color-red3"),
	RED4("NTEwMTRlNGY0MWQ3NzI5OTI4ZjIxNTU1NWRhMmVhZjE1OGNlODNkOWUwYzk5NjFiZWY1ZWI3NjEzZDM3ZSJ9fX0=", "color-red4"),
	YELLOW("MTRjNDE0MWMxZWRmM2Y3ZTQxMjM2YmQ2NThjNWJjN2I1YWE3YWJmN2UyYTg1MmI2NDcyNTg4MThhY2Q3MGQ4In19fQ==", "color-yellow"),
	YELLOW2("ZDQ1YjQ0ZmQxOWQ3MmZiM2Q2ZTE4OWM0OTc4YjFjYTY4N2RiZDY1ODBiMThkZGQ4YWE3MTBlZGZmYTUifX19", "color-yellow2"),
	ORANGE("ZDNjZGIxNmFiYjE3NTFkMWE0ODFlZDg3YjU3ZGIzYjg4M2U5OTYxZGEyZjlkNDg1YTI5ODY0ODdlMiJ9fX0=", "color-orange"),
	ORANGE2("ZjU5OTY5NTdiZmQ0Y2FmZTVkOTk5Njg0YzNkNTI5NGJkOWM1ZGZhNzg3ZGY0NjdiYjBhZmNmNTViYWFiZTgifX19", "color-orange2"),
	PURPLE("ZTkzNTJiY2FiZmMyN2VkYjQ0Y2ViNTFiMDQ3ODY1NDJmMjZhMjk5YTA1Mjk0NzUzNDYxODZlZTk0NzM4ZiJ9fX0=", "color-purple"),
	PINK("OTEzM2ZhNTJkZDc0ZDcxMWU1Mzc0N2RhOTYzYjhhZGVjZjkyZGI5NDZiZTExM2I1NmMzOGIzZGMyNzBlZWIzIn19fQ==", "color-pink"),
	PINK2("ODU1NjU0YjNmMWJmYjJjZGYwZjRiNTJkNjM2MGEwM2QzMWRkYWZjNzEwZjhhZmFlYTk5ZmJhNjY3ZTQ4MmRmIn19fQ==", "color-pink2"),
	PINK3("NzU1N2RiNWYxNWNhNmYzNzAxOTAzY2NhNDAyY2U3N2VjNmY4ODUwMzZiNjgxMmU4Mjg4YWJkN2U5NCJ9fX0=", "color-pink3"),
	PINK4("NjA3MzI2ZDMxODU4ZWE1N2U3YmM1NWYzZTc1ZTZjODViMzRmZjRiZmQyODA4OGY5NGYxMWViOGUwZDFjZiJ9fX0=", "color-pink4"),
	//BLOCKS
	CHEST("NmY2OGQ1MDliNWQxNjY5Yjk3MWRkMWQ0ZGYyZTQ3ZTE5YmNiMWIzM2JmMWE3ZmYxZGRhMjliZmM2ZjllYmYifX19", "blocks-chest"),
	ENDERCHEST("YTZjYzQ4NmMyYmUxY2I5ZGZjYjJlNTNkZDlhM2U5YTg4M2JmYWRiMjdjYjk1NmYxODk2ZDYwMmI0MDY3In19fQ==", "blocks-enderchest"),
	BOOKSHELF("NzI0ZmVkODQ2ODQzMDc0NDBjMTM3MWI0ODM0M2JkYmVhYjZjM2FmNzY2NWVhOTVjMmFjMzA2MTMwYTk1ZiJ9fX0=", "blocks-bookshelf"),
	WOODPLANK("YTBlOWQyYmViODRiMzJlM2YxNWUzODBjYzJjNTUxMDY0MjkxMWE1MTIxMDVmYTJlYzY3OWJjNTQwZmQ4MTg0In19fQ==", "blocks-woodplank"),
	WOODLOG("ZmZlNTEwOWM4NmZlNmRlOGViOGFmZTMyZjA0OTZhODQ0ZGQ2NTVlNGQ0YTM5ZWY3YjBmYjYxNzkxODQ4YTVkYSJ9fX0=", "blocks-woodlog"),
	LEAVES("NDM3ZGJjNzE5MWJmYzM5YTQ1MDRlMmZhODkwYjAyNTlmNTFjMDY0ODIyMWVlZTliNDdmNGRhMmIzZDA1ZjIxIn19fQ==", "blocks-leaves"),
	GRASS("MzQ5YzYzYmM1MDg3MjMzMjhhMTllNTk3ZjQwODYyZDI3YWQ1YzFkNTQ1NjYzYWMyNDQ2NjU4MmY1NjhkOSJ9fX0=", "blocks-grass"),
	DIRT("MWFiNDNiOGMzZDM0ZjEyNWU1YTNmOGI5MmNkNDNkZmQxNGM2MjQwMmMzMzI5ODQ2MWQ0ZDRkN2NlMmQzYWVhIn19fQ==", "blocks-dirt"),
	SAND("ZDdkN2Q3MmU3OGYzNWRlY2QyYjA4ZWE5Yjc0NzkwZTVjZDdlMjY0ODRjZjI0NDliZGVjYTRmNzhiYTMifX19", "blocks-sand"),
	COALORE("Nzc4OGY1ZGRhZjUyYzU4NDIyODdiOTQyN2E3NGRhYzhmMDkxOWViMmZkYjFiNTEzNjVhYjI1ZWIzOTJjNDcifX19", "blocks-coalore"),
	IRONORE("ZGI5N2JkZjkyYjYxOTI2ZTM5ZjVjZGRmMTJmOGY3MTMyOTI5ZGVlNTQxNzcxZTBiNTkyYzhiODJjOWFkNTJkIn19fQ==", "blocks-ironore"),
	REDSTONEORE("ZThkZWVlNTg2NmFiMTk5ZWRhMWJkZDc3MDdiZGI5ZWRkNjkzNDQ0ZjFlM2JkMzM2YmQyYzc2NzE1MWNmMiJ9fX0=", "blocks-redstoneore"),
	GOLDORE("ZTRkZjg5MjI5M2E5MjM2ZjczZjQ4ZjllZmU5NzlmZTA3ZGJkOTFmN2I1ZDIzOWU0YWNmZDM5NGY2ZWNhIn19fQ==", "blocks-goldore"),
	DIAMONDORE("Zjg4Y2Q2ZGQ1MDM1OWM3ZDU4OThjN2M3ZTNlMjYwYmZjZDNkY2IxNDkzYTg5YjllODhlOWNiZWNiZmU0NTk0OSJ9fX0=", "blocks-diamondore"),
	EMERALDORE("NGZjNDk1ZDFlNmViNTRhMzg2MDY4YzZjYjEyMWM1ODc1ZTAzMWI3ZjYxZDcyMzZkNWYyNGI3N2RiN2RhN2YifX19", "blocks-emeraldore"),
	COALBLOCK("ZjZjNWVjYWM5NDJjNzdiOTVhYjQ2MjBkZjViODVlMzgwNjRjOTc0ZjljNWM1NzZiODQzNjIyODA2YTQ1NTcifX19", "blocks-coalblock"),
	IRONBLOCK("YmJhODQ1OTE0NWQ4M2ZmYzQ0YWQ1OGMzMjYwZTc0Y2E1YTBmNjM0YzdlZWI1OWExYWQzMjM0ODQ5YzkzM2MifX19", "blocks-ironblock"),
	REDSTONEBLOCK("ZDA4ZWU2ZWRmYTk4ZGI1ZWFlOWI5Yzk5MzZlOTQ0ODliMmQ0YmJiZDNkMmI0YjZiNDg4NWEzMjI0MDYxM2MifX19", "blocks-redstoneblock"),
	GOLDBLOCK("YjZkMWNlNjk3ZTlkYmFhNGNjZjY0MjUxNmFhYTU5ODEzMzJkYWMxZDMzMWFmZWUyZWUzZGNjODllZmRlZGIifX19", "blocks-goldblock"),
	DIAMONDBLOCK("YzAxNDYxOTczNjM0NTI1MTk2ZWNjNzU3NjkzYjE3MWFkYTRlZjI0YWE5MjgzNmY0MmVhMTFiZDc5YzNhNTAyZCJ9fX0=", "blocks-diamondblock"),
	EMERALDBLOCK("YWYxMjFmN2MxYWIxNTY3ZmYyMTk4M2ZmN2E5ZTU1YzQwYzBiODY1ZjA1MGQzN2U1ZDM1ZGVmYmFhIn19fQ==", "blocks-emeraldblock"),
	STONE("ZGU5YjhhYWU3ZjljYzc2ZDYyNWNjYjhhYmM2ODZmMzBkMzhmOWU2YzQyNTMzMDk4YjlhZDU3N2Y5MWMzMzNjIn19fQ==", "blocks-stone"),
	COBBLESTONE("MTk1NTM0ZTAyYzU5YjMzZWNlNTYxOTI4MDMzMTk3OTc3N2UwMjVmYTVmYTgxYWU3NWU5OWZkOGVmZGViYjgifX19", "blocks-cobblestone"),
	BEDROCK("MzZkMWZhYmRmM2UzNDI2NzFiZDlmOTVmNjg3ZmUyNjNmNDM5ZGRjMmYxYzllYThmZjE1YjEzZjFlN2U0OGI5In19fQ==", "blocks-bedrock"),
	COMMANDBLOCK("YmYzODlmYmZlY2JkMmM0NzA5MmM2ZGRmNDIwMTRhNDViNGQ0ZmY3YmYxYjgyMzcwMzRiYWEzNDgzNmI1NSJ9fX0=", "blocks-commandblock"),
	//DECORATIONS
	MONITOR("OGQxOWM2ODQ2MTY2NmFhY2Q3NjI4ZTM0YTFlMmFkMzlmZTRmMmJkZTMyZTIzMTk2M2VmM2IzNTUzMyJ9fX0=", "decorations-monitor"),
	CAMERA("ZWE3ZDJhN2ZiYjRkMzdiNGQ1M2ZlODc3NTcxMjhlNWVmNjZlYzIzZDdmZjRmZTk5NDQ1NDZkYmM4Y2U3NzcifX19", "decorations-camera"),
	PRESENT("MmEyMzZkZTQ2MDJkMjRkM2YyYWViOGE0MjI3ZDMwYjE1ZWJiYTgxZjhiNjRjYmM1OWFlYmUxNzIxNTQifX19", "decorations-present"),
	ILUSIONBLOCK("YjQ2MmRkZmE1NTNjZTc4NjgzYmU0NzdiOGQ4NjU0ZjNkZmMzYWEyOTY5ODA4NDc4Yzk4N2FiODhjMzc2YTAifX19", "decorations-ilusionblock"),
	RUBIKSCUBE("NWQ4NmU3YmQyOGMxNDZmNzE1MTRjNzgyY2FjMDU1ODYwZDFmMzcyYjRhOWJlM2ZlNjVjZmUxMTA0NzMzYmEifX19", "decorations-rubikscube"),
	POKEBALL("OGRhZTNkNTQyNzQ3NGRlOGVkZGFiM2VmY2RjY2NjYjFkYTcxZDEwMTU3N2RmMGYyOTg1NDc2MzI4ODgxMSJ9fX0=", "decorations-pokeball"),
	GLOBE("OWRmYzg5MzI4NjVmZDU3ZDlkMjM2NWYxYWUyZDQ3NTEzNWQ3NDZiMmFmMTVhYmQzM2ZmYzJhNmFiZDM2MjgyIn19fQ==", "decorations-globe"),
	SKULL("MWFlMzg1NWY5NTJjZDRhMDNjMTQ4YTk0NmUzZjgxMmE1OTU1YWQzNWNiY2I1MjYyN2VhNGFjZDQ3ZDMwODEifX19", "decorations-skull"),
	//OTHERS
	FACEBOOK("ZGViNDYxMjY5MDQ0NjNmMDdlY2ZjOTcyYWFhMzczNzNhMjIzNTliNWJhMjcxODIxYjY4OWNkNTM2N2Y3NTc2MiJ9fX0=", "other-facebook"),
	INSTAGRAM("MjViM2YyY2ZhMDczOWM0ZTgyODMxNmYzOWY5MGIwNWJjMWY0ZWQyN2IxZTM1ODg4NTExZjU1OGQ0Njc1In19fQ==", "other-instagram"),
	SNAPCHAT("ODczNTgyOWFkMGE4NzhmOTYwZDc5NGE2MWUzZjE3MjVmZmQxYTBkNTRmNzRjZDk0NjUyY2I2OWIyNGUzIn19fQ==", "other-snapchat"),
	TWITTER("MzY4NWEwYmU3NDNlOTA2N2RlOTVjZDhjNmQxYmEyMWFiMjFkMzczNzFiM2Q1OTcyMTFiYjc1ZTQzMjc5In19fQ==", "other-twitter"),
	YOUTUBE("YjQzNTNmZDBmODYzMTQzNTM4NzY1ODYwNzViOWJkZjBjNDg0YWFiMDMzMWI4NzJkZjExYmQ1NjRmY2IwMjllZCJ9fX0=", "other-youtube"),
	RAINBOW("N2JlNzU0NTI5N2RmZDYyNjZiYmFhMjA1MTgyNWU4ODc5Y2JmYTQyYzdlN2UyNGU1MDc5NmYyN2NhNmExOCJ9fX0=", "other-rainbow"),
	//MYLITTLEPONY
	RAINBOWDASH("YTQ3OGNlZmVkOWUxYzhiNzMzNmFiM2E2YzYyMjYzZTk4OGU4ODcyYWU2MTg1ZjY0NzVmNTU3YzRjOWMyZiJ9fX0=", "mlp-rainbowdash"),
	APPLEJACK("ZWQ2M2I0Y2FkN2YzNzRjMTJiZWNjMWFmNDE3YmFjNjg5NzFlNzljMWQ0NzNjOWNjY2M2YWJmZjI3NzJlIn19fQ==", "mlp-applejack"),
	TWILIGHTSPARKLE("NGE2MzdlYjA5ZWFhZTAyN2U1OTc1MWUyZDQ5OWFjNjg2MWExNzc3ZTlhYmEzZmUxOGZkOTFmN2QxNDFkIn19fQ==", "mlp-twilightsparkle"),
	RARITY("NWU2ZmRkYWFhY2VkNDQyZmY4NDFmZDU5NmUzYzk3N2JiMmNkZjkyMGVmYmMxOGFkMWU5YjdhNTU5Y2E5YzkifX19", "mlp-rarity"),
	PINKIEPIE("YzM4MmNmNjk3YjRjN2Q1ZTQ3ZWY4MjIyMzRhNWNiZGZlMWNjNDRmYTY1NWQ3MjcxNWM2OTNkZjU0MjU1N2IifX19", "mlp-pinkiepie"),
	FLUTTERSHY("MjUwMzdiMmU3NGZiNjI2Njk2YWM4MTI2YzE0NDY4OWY1MTgyODc4ZjA5MzEyMzhhM2MxYWZkZmE5YWEifX19", "mlp-fluttershy"),
	DERPY("MTRmMWI5ZTg3M2NmYWQ0NmNjYjk5NGNkZTNmZTg4NzkyNThiMzNiM2UzMTJlOWZmOGRkODNmOGQ1MzYxNSJ9fX0=", "mlp-derpy"),
	//COUNTRIES
	FRANCE("YmEyNTI4N2QxMTQwZmIxNzQxZDRiNmY3ZTY1NjcyZjllNjRmZmZlODBlYTczNzFjN2YzZWM1YTZmMDQwMzkifX19", "country-france"),
	ENGLAND("YmVlNWM4NTBhZmJiN2Q4ODQzMjY1YTE0NjIxMWFjOWM2MTVmNzMzZGNjNWE4ZTIxOTBlNWMyNDdkZWEzMiJ9fX0=", "country-england"),
	ROMANIA("ODRkMzgwYWE5ZDY2YTJhOTY2ZWIxY2ZjMTc2MDhmMjhmYmZlM2E3NWY2YTE4YThiZTU0NDY4MjU4NmM0MWM0In19fQ==", "country-romania"),
	GERMANY("NWU3ODk5YjQ4MDY4NTg2OTdlMjgzZjA4NGQ5MTczZmU0ODc4ODY0NTM3NzQ2MjZiMjRiZDhjZmVjYzc3YjNmIn19fQ==", "country-germany"),
	MONACO("NWRiMjY3OGNjYWJhNzkzNDQxMmNiOTdlZTE2ZDQxNjQ2M2EzOTI1NzRjNTkwNjM1MmYxOGRlYTQyODk1ZWUifX19", "country-monaco"),
	CANADA("ZjI0MWE2OTdmNmRmYjFjNTdjZGEzMjdiYWE2NzMyYTc4MjhjMzk4YmU0ZWJmZGJkMTY2YzIzMmJjYWUyYiJ9fX0=", "country-canada"),
	USA("N2QxNWQ1NjYyMDJhYzBlNzZjZDg5Nzc1OWRmNWQwMWMxMWY5OTFiZDQ2YzVjOWEwNDM1N2VhODllZTc1In19fQ==", "country-usa"),
	BELGIUM("NWM3OGFhZTQyZWY5ZWU5ZmFhNjdiNjRiYjk3NGNlYTI3NWNlNzAyNjU1ZDM1Zjg0MWI2MDE3NDE2ZWUxYzM5MyJ9fX0=", "countryr-belgium"),
	ITALY("YTU2YzVjYzE3MzE5YTZjOWVjODQ3MjUyZTRkMjc0NTUyZDk3ZGE5NWUxMDg1MDcyZGJhNDlkMTE3Y2YzIn19fQ==", "country-italy"),
	IRELAND("NWNhN2Q4ZDczZTlkNGE4YzAyMWZmOTE4NDVkNjFlMDQxOTg3NjkxOWUwZDdhMTMzOGQ4YzdkZTBlZjk1ZDIifX19", "countryr-ireland"),
	CZECHREPUBLIC("NDgxNTJiNzMzNGQ3ZWNmMzM1ZTQ3YTRmMzVkZWZiZDJlYjY5NTdmYzdiZmU5NDIxMjY0MmQ2MmY0NmU2MWUifX19", "country-czechrepublic"),
	NETHERLANDS("YzIzY2YyMTBlZGVhMzk2ZjJmNWRmYmNlZDY5ODQ4NDM0ZjkzNDA0ZWVmZWFiZjU0YjIzYzA3M2IwOTBhZGYifX19", "countryr-netherlands"),
	NORWAY("ZTA1OTZlMTY1ZWMzZjM4OWI1OWNmZGRhOTNkZDZlMzYzZTk3ZDljNjQ1NmU3YzJlMTIzOTczZmE2YzVmZGEifX19", "country-norway"),
	SWEDEN("ZTkxMDkwNGJmZjljODZmNmVkNDc2ODhlOTQyOWMyNmU4ZDljNWQ1NzQzYmQzZWJiOGU2ZjUwNDBiZTE5Mjk5OCJ9fX0=", "country-sweden"),
	JAPAN("ODA0M2FlOWJiZmE4YjhiYmI1Yzk2NGJiY2U0NWZiZTc5YTNhZDc0MmJlMDdiNTY2MDdjNjhjOGUxMTE2NCJ9fX0=", "country-japan"),
	CHINA("OTdkOWUxNzRjYmJkNGE3ODlmZjBmODFiNzcxZWNmMmJiMDkxODQ3MTg4NjVmZWMzNGQ1OGJlMWJjOGVlNjJkIn19fQ==", "country-china"),
	NORTHKOREA("MTk2OWQxMjY2MmZhZWJmYWNhNmY0YjA0NDJmY2IyNTFmZDYwYjYxYTlmY2RjZWVhMmJkYzIxZTAyNWViMjEifX19", "country-northkorea"),
	SOUTHKOREA("ZmMxYmU1ZjEyZjQ1ZTQxM2VkYTU2ZjNkZTk0ZTA4ZDkwZWRlOGUzMzljN2IxZThmMzI3OTczOTBlOWE1ZiJ9fX0=", "country-southkorea"),
	POLAND("OTIxYjJhZjhkMjMyMjI4MmZjZTRhMWFhNGYyNTdhNTJiNjhlMjdlYjMzNGY0YTE4MWZkOTc2YmFlNmQ4ZWIifX19", "country-poland"),
	//STEVEN-UNIVERSE
	BLUEDIAMOND("ZGMxNDVmYWMzZDZlYTNlMzY2NWExOTc3N2ZhMWJhNmEyZDQ1YjQ3NzNkYjkyYTc0MTUxYzY2NGYxMmNiOTI1OCJ9fX0=", "steven-blue-diamond"),
	YELLOWDIAMOND("NGZjNzk4YzcwMjYyN2I3ZmU3NDY4MTQ0ODIwY2E2MTYwODk5YzI0MzdlZGIyNjMzZmM0ZTBkNDQ0Mzg2YmE0YyJ9fX0=", "steven-yellow-diamond"),
	WHITEDIAMOND("YTNhMzBmNDc0Nzc5Y2U0NGQ4ZjMxYjExZGIyNWEzZGNiZDhmMTU2ODI4MzY0ODgyYTcxNGQ4Mjc4ZDEwZjM2MyJ9fX0=", "steven-white-diamond"),
	PINKDIAMOND("ODhhOWRkNTc4NDM2NTYxZDQ0NmI0MDc5ZGI1Y2UyYmRmZmZhOWEyMmVjMmQyMjk5Mzc4OWM1MDBiNTBhNGZjMCJ9fX0=", "steven-pink-diamond"),
	JASPER("ODRhMGZkNzRkYmZkOTU4ODIzNzM2MzQ2YWZhYTY1NWRiOGQ1OWNjODU4Y2MzM2MyNTYwYWE2MmM1N2Y0YjlhNiJ9fX0=", "steven-jasper"),
	PERIDOT("MWJmZDFiM2ExZWRiNTk3YmQ2M2EwNzRiYWVkZWE5YzE3ZWYxNWM2MzAyODc2YWQ5Mzg0NDFjZWYwYjE2NGEwIn19fQ==", "steven-peridot"),
	LAPISLAZULI("MzhlZTA5YjRkMTNiZjc5NjQyMWNlMDc5NTBmM2MwYTA3YjgzYmUxMjc3MzYyMzFjM2EwOWIwNTQxZGFiZjgzOCJ9fX0=", "steven-lapislazuli"),
	ROSEQUARTZ("MTdiZTkxNjMzZDU1NjJjZmEzYmNiMjNiYzgxZWEwODg3N2ZiY2VmZGM4YzQ3NjgyNzQ1YjFmN2YzNzFkIn19fQ==", "steven-rosequartz"),
	ROSEQUARTZ2("MjBmNDg0YWYyNzIwMDdiNjM5MTcwMzI3MmVkMTNiY2JmZGZiYjg0NWUwMzkyYmIyOTYyN2U5M2M2NzQ4M2YzNSJ9fX0=", "steven-rosequartz2"),
	PEARL("YmNjZmM1ZjQ1Y2E4MDUyODAwMDA1NWYyMWVmNTI0Y2Q5NjU4MzBlZjA0YjMxN2Y3ZGJmMzI2ODk1MDExMzFiOSJ9fX0=", "steven-pearl"),
	AMETHYST("ZmRiN2EwZmUzZTBkMmFmN2U0NTg0NTZlNDUxZmNjZTRjMzQwZjhiNDY1YTU5YTliNDZkODY3YmFiNjhiYzE0MCJ9fX0=", "steven-amethyst"),
	GARNET("YTFmZDRmZDNiNjRhOWE1YmQ3ZTMzYjk0ZGY5YzZlYTIyYTNjNTM5MTIyODRiNmM5YzIzOTk5NDdjODM4ZDM2MyJ9fX0=", "steven-garnet"),
	STEVENUNIVERSE("M2YwNzE3YTdlYzYwZDgxMmJhYzFmN2Q3ZTZkOGUyZDdkMzlmNDRkZmZjZDI1ZTk0MjRlYWZiOTA0MDg0MGM3MSJ9fX0=", "steven-steven"),
	SAPPHIRE("MmM0ZmUwNWJhN2ExMzA1ZTE2MTlmNDAzNjJjNmJjYjdjNjc5YWQ0ZTFmOGM5Mjg0OTg3NzU3MDRhYzBjZmZmYiJ9fX0=", "steven-sapphire"),
	RUBY("NjNkZGJmMzU3Njk0ODE2YzRiODA2NDkwNWQ2OGEyNTgzNjU3YWRhY2MzODYzMWQ5MGI4NmIyZTE2ZDdiM2IyYiJ9fX0=", "steven-ruby"),
	//ALPHABET-WOOD
	W0("MGViZTdlNTIxNTE2OWE2OTlhY2M2Y2VmYTdiNzNmZGIxMDhkYjg3YmI2ZGFlMjg0OWZiZTI0NzE0YjI3In19fQ==", "wood-0"),
	W1("NzFiYzJiY2ZiMmJkMzc1OWU2YjFlODZmYzdhNzk1ODVlMTEyN2RkMzU3ZmMyMDI4OTNmOWRlMjQxYmM5ZTUzMCJ9fX0=", "wood-1"),
	W2("NGNkOWVlZWU4ODM0Njg4ODFkODM4NDhhNDZiZjMwMTI0ODVjMjNmNzU3NTNiOGZiZTg0ODczNDE0MTk4NDcifX19", "wood-2"),
	W3("MWQ0ZWFlMTM5MzM4NjBhNmRmNWU4ZTk1NTY5M2I5NWE4YzNiMTVjMzZiOGI1ODc1MzJhYzA5OTZiYzM3ZTUifX19", "wood-3"),
	W4("ZDJlNzhmYjIyNDI0MjMyZGMyN2I4MWZiY2I0N2ZkMjRjMWFjZjc2MDk4NzUzZjJkOWMyODU5ODI4N2RiNSJ9fX0=", "wood-4"),
	W5("NmQ1N2UzYmM4OGE2NTczMGUzMWExNGUzZjQxZTAzOGE1ZWNmMDg5MWE2YzI0MzY0M2I4ZTU0NzZhZTIifX19", "wood-5"),
	W6("MzM0YjM2ZGU3ZDY3OWI4YmJjNzI1NDk5YWRhZWYyNGRjNTE4ZjVhZTIzZTcxNjk4MWUxZGNjNmIyNzIwYWIifX19", "wood-6"),
	W7("NmRiNmViMjVkMWZhYWJlMzBjZjQ0NGRjNjMzYjU4MzI0NzVlMzgwOTZiN2UyNDAyYTNlYzQ3NmRkN2I5In19fQ==", "wood-7"),
	W8("NTkxOTQ5NzNhM2YxN2JkYTk5NzhlZDYyNzMzODM5OTcyMjI3NzRiNDU0Mzg2YzgzMTljMDRmMWY0Zjc0YzJiNSJ9fX0=", "wood-8"),
	W9("ZTY3Y2FmNzU5MWIzOGUxMjVhODAxN2Q1OGNmYzY0MzNiZmFmODRjZDQ5OWQ3OTRmNDFkMTBiZmYyZTViODQwIn19fQ==", "wood-9"),
	WBLANK("NWRiNTMyYjVjY2VkNDZiNGI1MzVlY2UxNmVjZWQ3YmJjNWNhYzU1NTk0ZDYxZThiOGY4ZWFjNDI5OWM5ZmMifX19", "wood-blank"),
	WA("YTY3ZDgxM2FlN2ZmZTViZTk1MWE0ZjQxZjJhYTYxOWE1ZTM4OTRlODVlYTVkNDk4NmY4NDk0OWM2M2Q3NjcyZSJ9fX0=", "wood-a"),
	WB("NTBjMWI1ODRmMTM5ODdiNDY2MTM5Mjg1YjJmM2YyOGRmNjc4NzEyM2QwYjMyMjgzZDg3OTRlMzM3NGUyMyJ9fX0=", "wood-b"),
	WC("YWJlOTgzZWM0NzgwMjRlYzZmZDA0NmZjZGZhNDg0MjY3NjkzOTU1MWI0NzM1MDQ0N2M3N2MxM2FmMThlNmYifX19", "wood-c"),
	WD("MzE5M2RjMGQ0YzVlODBmZjlhOGEwNWQyZmNmZTI2OTUzOWNiMzkyNzE5MGJhYzE5ZGEyZmNlNjFkNzEifX19", "wood-d"),
	WE("ZGJiMjczN2VjYmY5MTBlZmUzYjI2N2RiN2Q0YjMyN2YzNjBhYmM3MzJjNzdiZDBlNGVmZjFkNTEwY2RlZiJ9fX0=", "wood-e"),
	WF("YjE4M2JhYjUwYTMyMjQwMjQ4ODZmMjUyNTFkMjRiNmRiOTNkNzNjMjQzMjU1OWZmNDllNDU5YjRjZDZhIn19fQ==", "wood-f"),
	WG("MWNhM2YzMjRiZWVlZmI2YTBlMmM1YjNjNDZhYmM5MWNhOTFjMTRlYmE0MTlmYTQ3NjhhYzMwMjNkYmI0YjIifX19", "wood-g"),
	WH("MzFmMzQ2MmE0NzM1NDlmMTQ2OWY4OTdmODRhOGQ0MTE5YmM3MWQ0YTVkODUyZTg1YzI2YjU4OGE1YzBjNzJmIn19fQ==", "wood-h"),
	WI("NDYxNzhhZDUxZmQ1MmIxOWQwYTM4ODg3MTBiZDkyMDY4ZTkzMzI1MmFhYzZiMTNjNzZlN2U2ZWE1ZDMyMjYifX19", "wood-i"),
	WJ("M2E3OWRiOTkyMzg2N2U2OWMxZGJmMTcxNTFlNmY0YWQ5MmNlNjgxYmNlZGQzOTc3ZWViYmM0NGMyMDZmNDkifX19", "wood-j"),
	WK("OTQ2MWIzOGM4ZTQ1NzgyYWRhNTlkMTYxMzJhNDIyMmMxOTM3NzhlN2Q3MGM0NTQyYzk1MzYzNzZmMzdiZTQyIn19fQ==", "wood-k"),
	WL("MzE5ZjUwYjQzMmQ4NjhhZTM1OGUxNmY2MmVjMjZmMzU0MzdhZWI5NDkyYmNlMTM1NmM5YWE2YmIxOWEzODYifX19", "wood-l"),
	WM("NDljNDVhMjRhYWFiZjQ5ZTIxN2MxNTQ4MzIwNDg0OGE3MzU4MmFiYTdmYWUxMGVlMmM1N2JkYjc2NDgyZiJ9fX0=", "wood-m"),
	WN("MzViOGIzZDhjNzdkZmI4ZmJkMjQ5NWM4NDJlYWM5NGZmZmE2ZjU5M2JmMTVhMjU3NGQ4NTRkZmYzOTI4In19fQ==", "wood-n"),
	WO("ZDExZGUxY2FkYjJhZGU2MTE0OWU1ZGVkMWJkODg1ZWRmMGRmNjI1OTI1NWIzM2I1ODdhOTZmOTgzYjJhMSJ9fX0=", "wood-o"),
	WP("YTBhNzk4OWI1ZDZlNjIxYTEyMWVlZGFlNmY0NzZkMzUxOTNjOTdjMWE3Y2I4ZWNkNDM2MjJhNDg1ZGMyZTkxMiJ9fX0=", "wood-p"),
	WQ("NDM2MDlmMWZhZjgxZWQ0OWM1ODk0YWMxNGM5NGJhNTI5ODlmZGE0ZTFkMmE1MmZkOTQ1YTU1ZWQ3MTllZDQifX19", "wood-q"),
	WR("YTVjZWQ5OTMxYWNlMjNhZmMzNTEzNzEzNzliZjA1YzYzNWFkMTg2OTQzYmMxMzY0NzRlNGU1MTU2YzRjMzcifX19", "wood-r"),
	WS("M2U0MWM2MDU3MmM1MzNlOTNjYTQyMTIyODkyOWU1NGQ2Yzg1NjUyOTQ1OTI0OWMyNWMzMmJhMzNhMWIxNTE3In19fQ==", "wood-s"),
	WT("MTU2MmU4YzFkNjZiMjFlNDU5YmU5YTI0ZTVjMDI3YTM0ZDI2OWJkY2U0ZmJlZTJmNzY3OGQyZDNlZTQ3MTgifX19", "wood-t"),
	WU("NjA3ZmJjMzM5ZmYyNDFhYzNkNjYxOWJjYjY4MjUzZGZjM2M5ODc4MmJhZjNmMWY0ZWZkYjk1NGY5YzI2In19fQ==", "wood-u"),
	WV("Y2M5YTEzODYzOGZlZGI1MzRkNzk5Mjg4NzZiYWJhMjYxYzdhNjRiYTc5YzQyNGRjYmFmY2M5YmFjNzAxMGI4In19fQ==", "wood-v"),
	WW("MjY5YWQxYTg4ZWQyYjA3NGUxMzAzYTEyOWY5NGU0YjcxMGNmM2U1YjRkOTk1MTYzNTY3ZjY4NzE5YzNkOTc5MiJ9fX0=", "wood-w"),
	WX("NWE2Nzg3YmEzMjU2NGU3YzJmM2EwY2U2NDQ5OGVjYmIyM2I4OTg0NWU1YTY2YjVjZWM3NzM2ZjcyOWVkMzcifX19", "wood-x"),
	WY("YzUyZmIzODhlMzMyMTJhMjQ3OGI1ZTE1YTk2ZjI3YWNhNmM2MmFjNzE5ZTFlNWY4N2ExY2YwZGU3YjE1ZTkxOCJ9fX0=", "wood-y"),
	WZ("OTA1ODJiOWI1ZDk3OTc0YjExNDYxZDYzZWNlZDg1ZjQzOGEzZWVmNWRjMzI3OWY5YzQ3ZTFlMzhlYTU0YWU4ZCJ9fX0=", "wood-z"),
	WDOT("NzMzYWEyNDkxNmM4ODY5NmVlNzFkYjdhYzhjZDMwNmFkNzMwOTZiNWI2ZmZkODY4ZTFjMzg0YjFkNjJjZmIzYyJ9fX0=", "wood-dot"),
	WQUESTIONMASRK("NGNlYzg1YmM4MDYxYmRhM2UxZDQ5Zjc1NDQ2NDllNjVjODI3MmNhNTZmNzJkODM4Y2FmMmNjNDgxNmI2OSJ9fX0=", "wood-question_mark"),
	WEXCLAMANTIONMARK("ZWNhNmFiNzJlMDdiN2E1NTcwNGJkN2NjZjNkODJkYTBhNzM0NDNiZWViZGM1M2FjN2M5MDE0NDI3OWYwIn19fQ==", "wood-exclamantion_mark"),
	WCOLON("Y2NiZWUyOGUyYzc5ZGIxMzhmMzk3N2JhNDcyZGZhZTZiMTFhOWJiODJkNWIzZDdmMjU0NzkzMzhmZmYxZmU5MiJ9fX0=", "wood-colon"),
	WSLASH("N2Y5NWQ3YzFiYmYzYWZhMjg1ZDhkOTY3NTdiYjU1NzIyNTlhM2FlODU0ZjUzODlkYzUzMjA3Njk5ZDk0ZmQ4In19fQ==", "wood-slash"),
	WUP("NzNjZjE2NmE4MjZkODU1NDU0ZWQ0ZDRlYTVmZTMzZjNkZWVhYTQ0Y2NhYTk5YTM0OGQzOTY4NWJhNzFlMWE0ZiJ9fX0=", "wood-up"),
	WDOWN("MzhjYTc2MTVjYjgzN2Y2OTRlNDk2ZmY4YTk4NTNjZDdkYjVmZDg1NTI5ZGNhZDk4Yzc4YmEyNmMzZTRmNjg3In19fQ==", "wood-down"),
	WLEFT("NzM3NjQ4YWU3YTU2NGE1Mjg3NzkyYjA1ZmFjNzljNmI2YmQ0N2Y2MTZhNTU5Y2U4YjU0M2U2OTQ3MjM1YmNlIn19fQ==", "wood-left"),
	WRIGHT("MWE0ZjY4YzhmYjI3OWU1MGFiNzg2ZjlmYTU0Yzg4Y2E0ZWNmZTFlYjVmZDVmMGMzOGM1NGM5YjFjNzIwM2Q3YSJ9fX0=", "wood-right"),
	//ALPHABET-STONE
	S0("NTVhMjI0ODA3NjkzOTc4ZWQ4MzQzNTVmOWU1MTQ1ZjljNTZlZjY4Y2Y2ZjJjOWUxNzM0YTQ2ZTI0NmFhZTEifX19", "stone-0"),
	S1("MzFhOTQ2M2ZkM2M0MzNkNWUxZDlmZWM2ZDVkNGIwOWE4M2E5NzBiMGI3NGRkNTQ2Y2U2N2E3MzM0OGNhYWIifX19", "stone-1"),
	S2("YWNiNDE5ZDk4NGQ4Nzk2MzczYzk2NDYyMzNjN2EwMjY2NGJkMmNlM2ExZDM0NzZkZDliMWM1NDYzYjE0ZWJlIn19fQ==", "stone-2"),
	S3("ZjhlYmFiNTdiNzYxNGJiMjJhMTE3YmU0M2U4NDhiY2QxNGRhZWNiNTBlOGY1ZDA5MjZlNDg2NGRmZjQ3MCJ9fX0=", "stone-3"),
	S4("NjJiZmNmYjQ4OWRhODY3ZGNlOTZlM2MzYzE3YTNkYjdjNzljYWU4YWMxZjlhNWE4YzhhYzk1ZTRiYTMifX19", "stone-4"),
	S5("ZWY0ZWNmMTEwYjBhY2VlNGFmMWRhMzQzZmIxMzZmMWYyYzIxNjg1N2RmZGE2OTYxZGVmZGJlZTdiOTUyOCJ9fX0=", "stone-5"),
	S6("ZjMzMWE2YTZmY2Q2OTk1YjYyMDg4ZDM1M2JmYjY4ZDliODlhZTI1ODMyNWNhZjNmMjg4NjQ2NGY1NGE3MzI5In19fQ==", "stone-6"),
	S7("ZDRiYTZhYzA3ZDQyMjM3N2E4NTU3OTNmMzZkZWEyZWQyNDAyMjNmNTJmZDE2NDgxODE2MTJlY2QxYTBjZmQ1In19fQ==", "stone-7"),
	S8("YzYxYThhNjQxNDM3YmU5YWVhMjA3MjUzZGQzZjI1NDQwZDk1NGVhMmI1ODY2YzU1MmYzODZiMjlhYzRkMDQ5In19fQ==", "stone-8"),
	S9("YTE5MjhlMWJmZDg2YTliNzkzOTdjNGNiNGI2NWVmOTlhZjQ5YjdkNWY3OTU3YWQ2MmMwYzY5OWE2MjJjZmJlIn19fQ==", "stone-9"),
	SBLANK("MTZiNGI0MjMwYzhmYTI1NGJlNzUyNmEyYjI1M2RjMzUyYTUzYTVhOGVhZTZlZmI1MmVhMzRhOGY5YmQ5In19fQ==", "stone-blank"),
	SA("MmFjNThiMWEzYjUzYjk0ODFlMzE3YTFlYTRmYzVlZWQ2YmFmY2E3YTI1ZTc0MWEzMmU0ZTNjMjg0MTI3OGMifX19", "stone-a"),
	SB("ZDRjNzExNTcxZTdlMjE0ZWU3OGRmZTRlZTBlMTI2M2I5MjUxNmU0MThkZThmYzhmMzI1N2FlMDkwMTQzMSJ9fX0=", "stone-b"),
	SC("ZmZmNWFhYmVhZDZmZWFmYWFlY2Y0NDIyY2RkNzgzN2NiYjM2YjAzYzk4NDFkZDFiMWQyZDNlZGI3ODI1ZTg1MSJ9fX0=", "stone-c"),
	SD("ODkzZTYyMmI1ODE5NzU3OTJmN2MxMTllYzZmNDBhNGYxNmU1NTJiYjk4Nzc2YjBjN2FlMmJkZmQ0MTU0ZmU3In19fQ==", "stone-d"),
	SE("YTE1N2Q2NWIxOTkyMWM3NjBmZjQ5MTBiMzQwNDQ1NWI5YzJlZTM2YWZjMjAyZDg1MzhiYWVmZWM2NzY5NTMifX19", "stone-e"),
	SF("YzU0Y2YyNjFiMmNkNmFiNTRiMGM2MjRmOGY2ZmY1NjVhN2I2M2UyOGUzYjUwYzZkYmZiNTJiNWYwZDdjZjlmIn19fQ==", "stone-f"),
	SG("ZDNjOWY4YTc0Y2EwMWJhOGM1NGRlMWVkYzgyZTFmYzA3YTgzOTIzZTY2NTc0YjZmZmU2MDY5MTkyNDBjNiJ9fX0=", "stone-g"),
	SH("ZjhjNThjNTA5MDM0NjE3YmY4MWVlMGRiOWJlMGJhM2U4NWNhMTU1NjgxNjM5MTRjODc2NjllZGIyZmQ3In19fQ==", "stone-h"),
	SI("NDI0NjMyM2M5ZmIzMTkzMjZlZTJiZjNmNWI2M2VjM2Q5OWRmNzZhMTI0MzliZjBiNGMzYWIzMmQxM2ZkOSJ9fX0=", "stone-i"),
	SJ("YzU4NDU2Y2Q5YmI4YTdlOTc4NTkxYWUwY2IyNmFmMWFhZGFkNGZhN2ExNjcyNWIyOTUxNDVlMDliZWQ4MDY0In19fQ==", "stone-j"),
	SK("YWY0OWZiNzA4MzY5ZTdiYzI5NDRhZDcwNjk2M2ZiNmFjNmNlNmQ0YzY3MDgxZGRhZGVjZmU1ZGE1MSJ9fX0=", "stone-k"),
	SL("OGM4NGY3NTQxNmU4NTNhNzRmNmM3MGZjN2UxMDkzZDUzOTYxODc5OTU1YjQzM2JkOGM3YzZkNWE2ZGYifX19", "stone-l"),
	SM("MzFmZGU5MWIxOWI5MzA5OTEzNzI0ZmVhOWU4NTMxMTI3MWM2N2JjYjc4NTc4ZDQ2MWJmNjVkOTYxMzA3NCJ9fX0=", "stone-m"),
	SN("MWM3Yzk3MmU2Nzg1ZDZiMGFjZWI3NzlhYmRkNzcwMmQ5ODM0MWMyNGMyYTcxZTcwMjkzMGVjYTU4MDU1In19fQ==", "stone-n"),
	SO("ODA3M2JiNDRmOTM0NWY5YmIzMWE2NzkwMjdlNzkzOWU0NjE4NDJhOGMyNzQ4NmQ3YTZiODQyYzM5ZWIzOGM0ZSJ9fX0=", "stone-o"),
	SP("NjRiMjMxYThkNTU4NzBjZmI1YTlmNGU2NWRiMDZkZDdmOGUzNDI4MmYxNDE2Zjk1ODc4YjE5YWNjMzRhYzk1In19fQ==", "stone-p"),
	SQ("ZmZlZGQ2ZjllZmRiMTU2Yjg2OTM1Njk5YjJiNDgzNGRmMGY1ZDIxNDUxM2MwMWQzOGFmM2JkMDMxY2JjYzkyIn19fQ==", "stone-q"),
	SR("YzAzYTFjZDU4M2NiYmZmZGUwOGY5NDNlNTZhYzNlM2FmYWZlY2FlZGU4MzQyMjFhODFlNmRiNmM2NDY2N2Y3ZCJ9fX0=", "stone-r"),
	SS("YjY1NzJlNjU1NzI1ZDc4Mzc1YTk4MTdlYjllZThiMzc4MjljYTFmZWE5M2I2MDk1Y2M3YWExOWU1ZWFjIn19fQ==", "stone-s"),
	ST("NzA4YzllZjNhMzc1MWUyNTRlMmFmMWFkOGI1ZDY2OGNjZjVjNmVjM2VhMjY0MTg3N2NiYTU3NTgwN2QzOSJ9fX0=", "stone-t"),
	SU("NTVhNmUzYWU1YWU2MjU5MjM1MjQ4MzhmYWM5ZmVmNWI0MjUyN2Y1MDI3YzljYTE0OWU2YzIwNzc5MmViIn19fQ==", "stone-u"),
	SV("OTc1MTIxZjdkOWM2OGRhMGU1YjZhOTZhYzYxNTI5OGIxMmIyZWU1YmQxOTk4OTQzNmVlNjQ3ODc5ZGE1YiJ9fX0=", "stone-v"),
	SW("NjdlMTY1YzNlZGM1NTQxZDQ2NTRjNDcyODg3MWU2OTA4ZjYxM2ZjMGVjNDZlODIzYzk2ZWFjODJhYzYyZTYyIn19fQ==", "stone-w"),
	SX("MTkxOWQxNTk0YmY4MDlkYjdiNDRiMzc4MmJmOTBhNjlmNDQ5YTg3Y2U1ZDE4Y2I0MGViNjUzZmRlYzI3MjIifX19", "stone-x"),
	SY("ZTM1NDI0YmI4NjMwNWQ3NzQ3NjA0YjEzZTkyNGQ3NGYxZWZlMzg5MDZlNGU0NThkZDE4ZGNjNjdiNmNhNDgifX19", "stone-y"),
	SZ("NGU5MTIwMGRmMWNhZTUxYWNjMDcxZjg1YzdmN2Y1Yjg0NDlkMzliYjMyZjM2M2IwYWE1MWRiYzg1ZDEzM2UifX19", "stone-z"),
	SDOT("NmZmOTlmZjI3OWEyY2YyNWRlYjRiZDViNjZjMzU3NmI4MjRjYzk2YzM2NzgxMDI3YWY3MjdlZDNhNGMxMzA4ZSJ9fX0=", "stone-dot"),
	SQUESTIONMASRK("ZDIzZWFlZmJkNTgxMTU5Mzg0Mjc0Y2RiYmQ1NzZjZWQ4MmViNzI0MjNmMmVhODg3MTI0ZjllZDMzYTY4NzJjIn19fQ==", "stone-question_mark"),
	SEXCLAMANTIONMARK("ODdkMTlhYWJmY2ZkOTlmZmFiYTQyMTRjYWVmMjk5NTE2Y2U1MmU2ZDEzYmYyZGRhMTI1OTg1ZTQ4MWI3MmY5In19fQ==", "stone-exclamantion_mark"),
	SCOLON("YmQ4OThjNDBlNDdjNWQyZDc2OTI0MDY1MzYwNzY4MDY1ZDYyNGVlNWI5ZWUwYmU5ZTEyYjk4ZmI3N2M3NiJ9fX0=", "stone-colon"),
	SSLASH("MmQ1OTNmMDk0NWNiYjg1YThlMGJlN2Q5YTUyNjAxMGVlNzc0ODEwZjJiYzQyOGNkNGEyM2U0ZDIzMmVmZjgifX19", "stone-slash"),
	SUP("NThmZTI1MWE0MGU0MTY3ZDM1ZDA4MWMyNzg2OWFjMTUxYWY5NmI2YmQxNmRkMjgzNGQ1ZGM3MjM1ZjQ3NzkxZCJ9fX0=", "stone-up"),
	SDOWN("OWI3Y2U2ODNkMDg2OGFhNDM3OGFlYjYwY2FhNWVhODA1OTZiY2ZmZGFiNmI1YWYyZDEyNTk1ODM3YTg0ODUzIn19fQ==", "stone-down"),
	SLEFT("YmIwZjZlOGFmNDZhYzZmYWY4ODkxNDE5MWFiNjZmMjYxZDY3MjZhNzk5OWM2MzdjZjJlNDE1OWZlMWZjNDc3In19fQ==", "stone-left"),
	SRIGHT("ZjJmM2EyZGZjZTBjM2RhYjdlZTEwZGIzODVlNTIyOWYxYTM5NTM0YThiYTI2NDYxNzhlMzdjNGZhOTNiIn19fQ==", "stone-right");
	private ItemStack item;
	private String idTag;
	private String prefix = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUv";
	private Heads(String texture, String id)
    {
        item = HeadsCreating.createSkull(prefix + texture, id);
        idTag = id;
    }
   
   
    public ItemStack getItemStack()
    {
        return item;
    }
   
    public String getName()
    {
        return idTag;
    }
    
    
}
