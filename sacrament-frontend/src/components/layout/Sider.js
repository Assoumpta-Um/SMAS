import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import {
  Card,
  Stack,
  MenuList,
  MenuItem,
  ListItemIcon,
  Typography,
  Paper,
} from "@mui/material";
import DashboardIcon from "@mui/icons-material/Dashboard";
import GroupIcon from "@mui/icons-material/Group";
import ProductionQuantityLimitsIcon from "@mui/icons-material/ProductionQuantityLimits";
import ReceiptIcon from "@mui/icons-material/Receipt";
import MonetizationOnIcon from "@mui/icons-material/MonetizationOn";

const sideMenus = [
  {
    title: "Baptism Table",
    icon: <DashboardIcon />,
    path: "/baptism-table",
  },
  {
    title: "Eucharist Table",
    icon: <ProductionQuantityLimitsIcon />,
    path: "/eucharist-table",
  },
  {
    title: "Ordination Table",
    icon: <MonetizationOnIcon />,
    path: "/ordination-table",
  },
  {
    title: "Confirmation Table",
    icon: <ReceiptIcon />,
    path: "/confirmation-table",
  },
  {
    title: "Reconsiliation Table",
    icon: <GroupIcon />,
    path: "/reconsiliation-table",
  },
  {
    title: "Marriage Table",
    icon: <ReceiptIcon />,
    path: "/marriage-table",
  },
];
const Component = (props) => {
  const navigate = useNavigate();
  const [selectedItemIndex, setSelectedItemIndex] = useState(0);
  return (
    <Card sx={{ minHeight: "100vh" }}>
      <Paper sx={{ minHeight: "3rem" }}></Paper>
      <MenuList>
        <Stack spacing={4} justifyContent="center">
          {sideMenus?.map((menu, index) => (
            <MenuItem
              onClick={() => {
                setSelectedItemIndex(index);
                navigate(menu.path);
              }}
              selected={selectedItemIndex === index}
            >
              <ListItemIcon>{menu.icon}</ListItemIcon>
              <Typography variant="inherit">{menu.title}</Typography>
            </MenuItem>
          ))}
        </Stack>
      </MenuList>
    </Card>
  );
};

export default Component;
